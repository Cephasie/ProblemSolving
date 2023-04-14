let log = console.log;
let array = [7,14,21,14,22,7];
    function removeDuplicates(array) {
return array.filter((item,index) => array. indexOf(item)==index);
}
    log(removeDuplicates(array));