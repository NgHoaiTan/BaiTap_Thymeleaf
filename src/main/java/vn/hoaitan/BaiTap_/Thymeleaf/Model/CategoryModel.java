package vn.hoaitan.BaiTap_.Thymeleaf.Model;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable{
    private static final long serialVersionUID =1;


    @Id
    private Long id;

    @NotEmpty(message = "Khong duoc bo trong!")
    private String name;

    private String images;

    private int status;


    private Boolean isEdit = false;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getImages() {
        return images;
    }


    public void setImages(String images) {
        this.images = images;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }


    public Boolean getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Boolean isEdit) {
        this.isEdit = isEdit;
    }

}