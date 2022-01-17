import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
// import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;


    @NotNull
    @Size(min = 8, message = "the board name must not be less than 8 character")
    private String OfficedName;
    
    @NotNull
    private String school;

    

        // private Set<Office> offices;

   
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "office")
    private List<Office> offices = new ArrayList<>();
    
   
   
    public void addOffice(Office office) {
        this.offices.add(office);
    }
    // public String get 




  
    public String getBoardName() {
        return BoardName;
    }

  
    public void setBoardName(String BoardName) {
        this.BoardName = BoardName;
    }

       //getter | setter of Department/school for the addmin
    public String getDepartment() {
        return Department;
    }


    public void setDepartment(String Department) {
        this.Department = Department;
    }




}
