package ivandjoh.online.springmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean published;

    public Tutorial(String title, String description, boolean b) {
        this.title = title;
        this.description = description;
        this.published = b;
    }
}
