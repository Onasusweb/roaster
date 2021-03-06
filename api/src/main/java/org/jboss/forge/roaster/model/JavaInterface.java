/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.roaster.model;

import org.jboss.forge.roaster.Roaster;

/**
 * Represents a Java {@code interface} type. See {@link Roaster} for various options in generating {@link JavaInterface}
 * instances.
 *
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public interface JavaInterface<O extends JavaInterface<O>> extends
         JavaType<O>,
         GenericCapable<O>,
         PropertyHolder<O>,
         TypeHolder<O>,
         StaticCapable
{
}
