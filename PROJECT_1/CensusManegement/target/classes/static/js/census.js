function collectData() {

    const household = {
        householdId: document.getElementById("householdId").value,
        headName: document.getElementById("headName").value,
        aadharno: document.getElementById("aadharno").value,
        age: document.getElementById("age").value,
        state: document.getElementById("state").value,
        district: document.getElementById("district").value,
        subdistrict: document.getElementById("subdistrict").value,
        villageTown: document.getElementById("villageTown").value,
        wardBlock: document.getElementById("wardBlock").value,
        pincode: document.getElementById("pincode").value,
        houseNo: document.getElementById("houseNo").value,
        street: document.getElementById("street").value,
        houseType: document.getElementById("houseType").value,
        ownership: document.getElementById("ownership").value,
        numRooms: document.getElementById("numRooms").value,
        toiletType: document.getElementById("toiletType").value,
        waterSource: document.getElementById("waterSource").value,
        electricity: document.getElementById("electricity").value,
        kitchen: document.getElementById("kitchen").value,
        cookingFuel: document.getElementById("cookingFuel").value,
        fridge: document.getElementById("fridge").value,
        tv: document.getElementById("tv").value,
        internet: document.getElementById("internet").value,
        vehicle: document.getElementById("vehicle").value
    };

    const members = [];
    document.querySelectorAll(".member-card").forEach(card => {
        members.push({
            name: card.querySelector(".name").value,
            relation: card.querySelector(".relation").value,
            gender: card.querySelector(".gender").value,
            age: card.querySelector(".age").value,
            marital: card.querySelector(".marital").value,
            language: card.querySelector(".language").value,
            education: card.querySelector(".education").value,
            employment: card.querySelector(".employment").value,
            disability: card.querySelector(".disability").value
        });
    });

    return {
        household: household,
        members: members
    };
}

function handleSubmit(e){
  e.preventDefault();

  const data = collectData();

  fetch("/api/census/save", {
      method: "POST",
      headers: {
          "Content-Type": "application/json"
      },
      body: JSON.stringify(data)
  })
  .then(res => res.text())
  .then(msg => {
      alert(msg);
  });

  return false;
}
