/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sow.biblio.web.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author chuck
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BiblioCacheControl {
    String cacheControl () default "no-cache";
}
