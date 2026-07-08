package com.bytedance.keva.adapter.xml;

import X.C2188811AlT;
import android.util.Xml;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes31.dex */
public class XmlUtils {
    public static final void nextElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return;
            }
        } while (next != 1);
    }

    public static final int parseUnsignedIntAttribute(CharSequence charSequence) {
        String string = charSequence.toString();
        int length = string.length();
        int i = 0;
        int i2 = 16;
        if ('0' == string.charAt(0)) {
            if (length - 1 == 0) {
                return 0;
            }
            char cCharAt = string.charAt(1);
            if ('x' != cCharAt && 'X' != cCharAt) {
                i2 = 8;
                i = 1;
            } else {
                i = 2;
            }
        } else if ('#' != string.charAt(0)) {
            i2 = 10;
        } else {
            i = 1;
        }
        return (int) CastLongProtector.parseLong(string.substring(i), i2);
    }

    public static final ArrayList readListXml(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (ArrayList) readValueXml(xmlPullParserNewPullParser, new String[1]);
    }

    public static final HashMap readMapXml(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (HashMap) readValueXml(xmlPullParserNewPullParser, new String[1]);
    }

    public static final HashSet readSetXml(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (HashSet) readValueXml(xmlPullParserNewPullParser, new String[1]);
    }

    public static void skipCurrentTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static final void beginDocument(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals(str)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected start tag: found ");
                sbLIZ.append(xmlPullParser.getName());
                sbLIZ.append(", expected ");
                sbLIZ.append(str);
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static final boolean convertValueToBoolean(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return z;
        }
        if (!charSequence.equals("1") && !charSequence.equals("true") && !charSequence.equals("TRUE")) {
            return false;
        }
        return true;
    }

    public static final int convertValueToInt(CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (charSequence == null) {
            return i;
        }
        String string = charSequence.toString();
        int length = string.length();
        if ('-' == string.charAt(0)) {
            i3 = -1;
            i2 = 1;
        } else {
            i2 = 0;
            i3 = 1;
        }
        int i4 = 16;
        if ('0' == string.charAt(i2)) {
            if (i2 == length - 1) {
                return 0;
            }
            int i5 = i2 + 1;
            char cCharAt = string.charAt(i5);
            if ('x' != cCharAt && 'X' != cCharAt) {
                i2 = i5;
                i4 = 8;
            } else {
                i2 += 2;
            }
        } else if ('#' == string.charAt(i2)) {
            i2++;
        } else {
            i4 = 10;
        }
        return CastIntegerProtector.parseInt(string.substring(i2), i4) * i3;
    }

    public static final int convertValueToUnsignedInt(String str, int i) {
        if (str == null) {
            return i;
        }
        return parseUnsignedIntAttribute(str);
    }

    public static boolean nextElementWithin(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3) {
                    if (xmlPullParser.getDepth() == i) {
                        return false;
                    }
                } else if (next == 2 && xmlPullParser.getDepth() == i + 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static final Object readThisValueXml(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object objValueOf = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String strLIZIZ = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 != 1) {
                        if (next2 == 3) {
                            if (xmlPullParser.getName().equals("string")) {
                                strArr[0] = attributeValue;
                                return strLIZIZ;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unexpected end tag in <string>: ");
                            sbLIZ.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (next2 == 4) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(xmlPullParser.getText());
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else if (next2 == 2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Unexpected start tag in <string>: ");
                            sbLIZ3.append(xmlPullParser.getName());
                            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                }
            } else if (name.equals("int")) {
                objValueOf = Integer.valueOf(CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                objValueOf = CastLongProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                objValueOf = CastFloatProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                objValueOf = CastDoubleProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                objValueOf = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (name.equals("int-array")) {
                    xmlPullParser.next();
                    int[] thisIntArrayXml = readThisIntArrayXml(xmlPullParser, "int-array", strArr);
                    strArr[0] = attributeValue;
                    return thisIntArrayXml;
                }
                if (name.equals("map")) {
                    xmlPullParser.next();
                    HashMap thisMapXml = readThisMapXml(xmlPullParser, "map", strArr);
                    strArr[0] = attributeValue;
                    return thisMapXml;
                }
                if (name.equals("list")) {
                    xmlPullParser.next();
                    ArrayList thisListXml = readThisListXml(xmlPullParser, "list", strArr);
                    strArr[0] = attributeValue;
                    return thisListXml;
                }
                if (name.equals("set")) {
                    xmlPullParser.next();
                    HashSet thisSetXml = readThisSetXml(xmlPullParser, "set", strArr);
                    strArr[0] = attributeValue;
                    return thisSetXml;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Unknown tag: ");
                sbLIZ4.append(name);
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3) {
                    if (xmlPullParser.getName().equals(name)) {
                        strArr[0] = attributeValue;
                        return objValueOf;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Unexpected end tag in <");
                    sbLIZ5.append(name);
                    sbLIZ5.append(">: ");
                    sbLIZ5.append(xmlPullParser.getName());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ5));
                }
                if (next == 4) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Unexpected text in <");
                    sbLIZ6.append(name);
                    sbLIZ6.append(">: ");
                    sbLIZ6.append(xmlPullParser.getName());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ6));
                }
            } else {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("Unexpected end of document in <");
                sbLIZ7.append(name);
                sbLIZ7.append(">");
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ7));
            }
        } while (next != 2);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("Unexpected start tag in <");
        sbLIZ8.append(name);
        sbLIZ8.append(">: ");
        sbLIZ8.append(xmlPullParser.getName());
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ8));
    }

    public static final Object readValueXml(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType != 3) {
                if (eventType != 4) {
                    eventType = xmlPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected text: ");
                    sbLIZ.append(xmlPullParser.getText());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unexpected end tag at: ");
                sbLIZ2.append(xmlPullParser.getName());
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return readThisValueXml(xmlPullParser, strArr);
    }

    public static final void writeListXml(List list, OutputStream outputStream) throws IOException {
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(outputStream, "utf-8");
        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(list, null, xmlSerializerNewSerializer);
        xmlSerializerNewSerializer.endDocument();
    }

    public static final void writeMapXml(Map map, OutputStream outputStream) throws Throwable {
        FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
        fastXmlSerializer.setOutput(outputStream, "utf-8");
        fastXmlSerializer.startDocument(null, Boolean.TRUE);
        fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(map, null, fastXmlSerializer);
        fastXmlSerializer.endDocument();
    }

    public static final int convertValueToList(CharSequence charSequence, String[] strArr, int i) {
        if (charSequence != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (charSequence.equals(strArr[i2])) {
                    return i2;
                }
            }
        }
        return i;
    }

    public static final int[] readThisIntArrayXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int eventType = xmlPullParser.getEventType();
            int i = 0;
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Expected item tag at: ");
                        sbLIZ.append(xmlPullParser.getName());
                        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Expected ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" end tag at: ");
                        sbLIZ2.append(xmlPullParser.getName());
                        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Document ended before ");
            sbLIZ3.append(str);
            sbLIZ3.append(" end tag");
            throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final ArrayList readThisListXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected ");
                sbLIZ.append(str);
                sbLIZ.append(" end tag at: ");
                sbLIZ.append(xmlPullParser.getName());
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Document ended before ");
        sbLIZ2.append(str);
        sbLIZ2.append(" end tag");
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final HashMap readThisMapXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object thisValueXml = readThisValueXml(xmlPullParser, strArr);
                String str2 = strArr[0];
                if (str2 != null) {
                    map.put(str2, thisValueXml);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Map value without name attribute: ");
                    sbLIZ.append(xmlPullParser.getName());
                    throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return map;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected ");
                sbLIZ2.append(str);
                sbLIZ2.append(" end tag at: ");
                sbLIZ2.append(xmlPullParser.getName());
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Document ended before ");
        sbLIZ3.append(str);
        sbLIZ3.append(" end tag");
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final HashSet readThisSetXml(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected ");
                sbLIZ.append(str);
                sbLIZ.append(" end tag at: ");
                sbLIZ.append(xmlPullParser.getName());
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Document ended before ");
        sbLIZ2.append(str);
        sbLIZ2.append(" end tag");
        throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void writeByteArrayXml(byte[] bArr, String str, XmlSerializer xmlSerializer) throws IOException {
        int i;
        int i2;
        if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i3 = b >> 4;
            if (i3 >= 10) {
                i = (i3 + 97) - 10;
            } else {
                i = i3 + 48;
            }
            sb.append(i);
            int i4 = b & 255;
            if (i4 >= 10) {
                i2 = (i4 + 97) - 10;
            } else {
                i2 = i4 + 48;
            }
            sb.append(i2);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final void writeIntArrayXml(int[] iArr, String str, XmlSerializer xmlSerializer) throws IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static final void writeListXml(List list, String str, XmlSerializer xmlSerializer) throws IOException {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            writeValueXml(ListProtector.get(list, i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static final void writeMapXml(Map map, String str, XmlSerializer xmlSerializer) throws IOException {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            writeValueXml(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final void writeSetXml(Set set, String str, XmlSerializer xmlSerializer) throws IOException {
        if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            writeValueXml(it2.next(), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    public static final void writeValueXml(Object obj, String str, XmlSerializer xmlSerializer) throws IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else if (obj instanceof Boolean) {
            str2 = "boolean";
        } else {
            if (obj instanceof byte[]) {
                writeByteArrayXml((byte[]) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof int[]) {
                writeIntArrayXml((int[]) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof Map) {
                writeMapXml((Map) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof List) {
                writeListXml((List) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof Set) {
                writeSetXml((Set) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("writeValueXml: unable to write ");
            sbLIZ.append(str);
            sbLIZ.append(", class ");
            sbLIZ.append(obj.getClass());
            sbLIZ.append(", value ");
            sbLIZ.append(obj);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }
}
