package <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>.controller;

import com.baomidou.mybatisplus.plugins.Page;
import <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>.model.<%= entityClass %>;
import <%= groupCases.splitByDot %>.<%= nameCases.splitByDot %>.service.<%= entityClass %>Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Rest controller. <%= entityClass %>
 */
@Slf4j
@RestController
@RequestMapping("<%= tableName %>")
public class <%= entityClass %>Controller {

    @Autowired
    private <%= entityClass %>Service service;

    @PostMapping
    public ResponseEntity<<%= entityClass %>> create<%= entityClass %>(@Valid @RequestBody <%= entityClass %> <%= entityClassCamelCase %>) {
        log.debug("REST request to save <%= entityClass %> : {}", <%= entityClassCamelCase %>);
        service.insert(<%= entityClassCamelCase %>);
        return ResponseEntity.ok(<%= entityClassCamelCase %>);
    }


    @PutMapping
    public ResponseEntity<<%= entityClass %>> update<%= entityClass %>(@Valid @RequestBody <%= entityClass %> <%= entityClassCamelCase %>) {
        log.debug("REST request to update <%= entityClass %> : {}", <%= entityClassCamelCase %>);
        service.updateById(<%= entityClassCamelCase %>);
        return ResponseEntity.ok(<%= entityClassCamelCase %>);
    }


    @GetMapping
    @ApiOperation(value = "get all <%= tableName %>.", response = Page.class)
    public ResponseEntity<Page<<%= entityClass %>>> getAll<%= entityClass %>(@ApiParam Page pageable) {
        final Page<<%= entityClass %>> page = service.selectPage(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/info")
    @ApiOperation(value = "get the \"id\" <%= tableName %>", response = <%= entityClass %>.class)
    public ResponseEntity<<%= entityClass %>> get<%= entityClass %>(@RequestParam Integer id) {
        log.debug("REST request to get <%= entityClass %> : {}", id);
        <%= entityClass %> entity = service.selectById(id);
        return ResponseEntity.ok(entity);
    }


    @DeleteMapping
    public void delete<%= entityClass %>(@RequestParam Integer id) {
        log.debug("REST request to delete <%= entityClass %> : {}", id);
        service.deleteById(id);
    }
}
