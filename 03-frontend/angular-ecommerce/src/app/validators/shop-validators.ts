import { FormControl, ValidationErrors } from "@angular/forms";

export class ShopValidators {
    //whitespace validation

    static notOnlyWhitespace(control: FormControl): ValidationErrors {
        //check if strinh only contains whitespace
        if ((control.value != null) && (control.value.trim().length === 0)) {
    //invalid , return error object
            return {'notOnlyWhitespace':true};
        }
        //valid, return null
        return null;
    }
}
