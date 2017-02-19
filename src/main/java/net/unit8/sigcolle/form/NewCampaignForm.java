package net.unit8.sigcolle.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/**
 * @author kawasima
 */
@Data
public class NewCampaignForm extends FormBase {

    @NotNull
    @Length(min = 1, max = 20)
    private String title;
    @NotNull
    @Length(min = 1, max = 100)
    private String statement;
    @NotNull
    @DecimalMin("1")
    @DecimalMax("10000000")
    private Long goal;

    @Override
    public boolean hasErrors() {
        return super.hasErrors();
    }

    @Override
    public boolean hasErrors(String name) {
        return super.hasErrors(name);
    }

    @Override
    public List<String> getErrors(String name) {
        return super.getErrors(name);
    }
    }

