let input = "welcome";
let mid= Math.floor(input.length/2)
let newInput = input.substring(mid) + input.substring(0,mid);
let printText = "";
for(let i=0;i<newInput.length;i++) {
  printText += newInput.charAt(i);
  console.log(printText);
}
