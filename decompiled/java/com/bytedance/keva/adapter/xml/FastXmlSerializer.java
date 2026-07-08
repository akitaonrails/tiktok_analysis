package com.bytedance.keva.adapter.xml;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes31.dex */
public class FastXmlSerializer implements XmlSerializer {
    public static final String[] ESCAPE_TABLE = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public CharsetEncoder mCharset;
    public boolean mInTag;
    public OutputStream mOutputStream;
    public int mPos;
    public Writer mWriter;
    public final char[] mText = new char[8192];
    public ByteBuffer mBytes = ByteBuffer.allocate(8192);

    private void flushBytes() throws IOException {
        int iPosition = this.mBytes.position();
        if (iPosition > 0) {
            this.mBytes.flip();
            this.mOutputStream.write(this.mBytes.array(), 0, iPosition);
            this.mBytes.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        int i = this.mPos;
        if (i > 0) {
            if (this.mOutputStream != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.mText, 0, i);
                CoderResult coderResultEncode = this.mCharset.encode(charBufferWrap, this.mBytes, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        flushBytes();
                        coderResultEncode = this.mCharset.encode(charBufferWrap, this.mBytes, true);
                    } else {
                        flushBytes();
                        this.mOutputStream.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.mWriter.write(this.mText, 0, i);
            this.mWriter.flush();
            this.mPos = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException {
        flush();
    }

    private void append(char c) throws IOException {
        int i = this.mPos;
        if (i >= 8191) {
            flush();
            i = this.mPos;
        }
        this.mText[i] = c;
        this.mPos = i + 1;
    }

    private void escapeAndAppendString(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = ESCAPE_TABLE;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < length2 && (str2 = strArr[cCharAt]) != null) {
                if (i2 < i) {
                    append(str, i2, i - i2);
                }
                i2 = i + 1;
                append(str2);
            }
            i++;
        }
        if (i2 < i) {
            append(str, i2, i - i2);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
        this.mWriter = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException {
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(str);
        return this;
    }

    private void append(String str) throws IOException {
        append(str, 0, str.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException {
        if (this.mInTag) {
            append(" />\n");
        } else {
            append("</");
            if (str != null) {
                append(str);
                append(':');
            }
            append(str2);
            append(">\n");
        }
        this.mInTag = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws Throwable {
        if (outputStream != null) {
            try {
                this.mCharset = Charset.forName(str).newEncoder();
                this.mOutputStream = outputStream;
                return;
            } catch (IllegalCharsetNameException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sbLIZ.append(str2);
        sbLIZ.append("' ?>\n");
        append(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.mInTag) {
            append(">\n");
        }
        append('<');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        this.mInTag = true;
        return this;
    }

    private void append(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                append(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.mPos;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.mPos;
        }
        str.getChars(i, i + i2, this.mText, i6);
        this.mPos = i6 + i2;
    }

    private void escapeAndAppendString(char[] cArr, int i, int i2) throws IOException {
        String str;
        String[] strArr = ESCAPE_TABLE;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    append(cArr, i4, i - i4);
                }
                i4 = i + 1;
                append(str);
            }
            i++;
        }
        if (i4 < i) {
            append(cArr, i4, i - i4);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        append(' ');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        append("=\"");
        escapeAndAppendString(str3);
        append('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        if (this.mInTag) {
            append(">");
            this.mInTag = false;
        }
        escapeAndAppendString(cArr, i, i2);
        return this;
    }

    private void append(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                append(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.mPos;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.mPos;
        }
        System.arraycopy(cArr, i, this.mText, i6, i2);
        this.mPos = i6 + i2;
    }
}
