/*
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.repackaged.com.google.common.base;

/**
 * Helper functions that can operate on any {@code Object}.
 *
 * @author Laurence Gonsalves
 * @since 2 (imported from Google Collections Library)
 */
public final class Objects {
  private Objects() {
  }

  /**
   * Determines whether two possibly-null objects are equal. Returns:
   *
   * <ul>
   * <li>{@code true} if {@code a} and {@code b} are both null.
   * <li>{@code true} if {@code a} and {@code b} are both non-null and they are equal according to
   * {@link Object#equals(Object)}.
   * <li>{@code false} in all other situations.
   * </ul>
   *
   * <p>
   * This assumes that any non-null objects passed to this function conform to the {@code equals()}
   * contract.
   */
  public static boolean equal(Object a, Object b) {
    return a == b || a != null && a.equals(b);
  }
}