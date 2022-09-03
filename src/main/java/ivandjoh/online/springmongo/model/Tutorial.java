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
}
