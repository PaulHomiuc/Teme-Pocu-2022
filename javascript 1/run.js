function getStats(arr) {
    var obj = 0,
      number = 0,
      string = 0,
      undefined = 0,
      arrays =0,
      boolean = 0;
    for (i = 0; i < arr.length; i++) {
      switch (typeof arr[i]) {
        case "object":
          obj++;
          break;
        case "string":
          string++;
          break;
        case "number":
          number++;
          break;
        case "boolean":
          boolean++;
          break;
        case "undefined":
          undefined++;
          break;
      }
    }
    console.log(
        number +
        " numbers " +
        string +
        " strings " +
      obj +
        " objects " + 
        boolean +
        " booleans " +
        undefined +
        " undefineds "
    );
  }
  addF = (x) => {
    return (y) => {
      return x + y;
    };
  };
  
  var arr = [
    1,
    2,
    "hello",
    NaN,
    {
      city: "IasI",
      zip: null,
    },
    [11, 12],
    undefined,
    undefined,
    undefined,
  ];
  ///1
  
  getStats(arr);
  
  ///2
  
  let add = addF(13);
  console.log(add(10)); // 23
  console.log(add(-5)); // 8
  
  ///3
  let callCount = 0;
  function add2(x, y) {
    return x + y;
  }

  function limit(add2, max) {
    function altaFunctie(x, y) {
      if (max > 0) {
        max--;
        return add2(x, y);
      }
      return undefined;
    }
    return altaFunctie;
  }
  let limitAdd = limit(add2, 2);
  console.log(limitAdd(3, 5)); // 8
  console.log(limitAdd(11, 23)); //34
  console.log(limitAdd(5, 10)); // undefined
  
  ///4
  function whatIsInAName(arr, object) {
    for (let i = 0; i < arr.length; i++)
      if (arr[i].first == object.first || arr[i].last == object.last) return arr[i];
  }
  let array = [
    {first: "Romeo", last: "Montague"},
    {first: "Mercutio", last: null},
    {first: "Tybalt", last: "Capulet"},
  ];
  
  console.log(whatIsInAName(array, {last: "Capulet"}));
  console.log(whatIsInAName([{apple: 1}, {apple: 1}, {apple: 1, bat: 2}], {apple: 1}));
  console.log(whatIsInAName([{a: 1, b: 2, c: 3}], {a: 1, b: 9999, c: 3}));