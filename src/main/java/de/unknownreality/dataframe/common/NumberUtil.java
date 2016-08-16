/*
 * Copyright (c) 2016 Alexander Grün
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.unknownreality.dataframe.common;

/**
 * Created by Alex on 07.07.2016.
 */
public class NumberUtil {
    public static <T extends Number> T add(Number a, Number b, Class<T> cl) {
        return convert(a.doubleValue() + b.doubleValue(), cl);
    }

    public static <T extends Number> T subtract(Number a, Number b, Class<T> cl) {
        return convert(a.doubleValue() - b.doubleValue(), cl);
    }

    public static <T extends Number> T multiply(Number a, Number b, Class<T> cl) {
        return convert(a.doubleValue() * b.doubleValue(), cl);
    }

    public static <T extends Number> T divide(Number a, Number b, Class<T> cl) {
        return convert(a.doubleValue() / b.doubleValue(), cl);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Number> T convert(Number n, Class<T> cl) {
        if (cl == Double.class) {
            return (T) new Double(n.doubleValue());
        } else if (cl == Integer.class) {
            return (T) new Integer(n.intValue());
        } else if (cl == Float.class) {
            return (T) new Float(n.floatValue());
        } else if (cl == Long.class) {
            return (T) new Long(n.longValue());
        } else if (cl == Short.class) {
            return (T) new Short(n.shortValue());
        } else if (cl == Byte.class) {
            return (T) new Byte(n.byteValue());
        }
        return null;
    }
}