package com.ss.android.vesdk.model;

import X.C2188811AlT;
import com.ss.android.ttve.nativePort.TEParcelWrapper;

/* JADX INFO: loaded from: classes34.dex */
public class BefTextLayout {
    public long backColor;
    public int charSize;
    public String familyName;
    public boolean isPlaceholder;
    public int letterSpacing;
    public int lineCount;
    public float lineHeight;
    public int lineWidth;
    public int split;
    public int textAlign;
    public long textColor;
    public int textIndent;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BefTextLayout{charSize=");
        sbLIZ.append(this.charSize);
        sbLIZ.append(", letterSpacing=");
        sbLIZ.append(this.letterSpacing);
        sbLIZ.append(", lineWidth=");
        sbLIZ.append(this.lineWidth);
        sbLIZ.append(", lineHeight=");
        sbLIZ.append(this.lineHeight);
        sbLIZ.append(", textAlign=");
        sbLIZ.append(this.textAlign);
        sbLIZ.append(", textIndent=");
        sbLIZ.append(this.textIndent);
        sbLIZ.append(", split=");
        sbLIZ.append(this.split);
        sbLIZ.append(", lineCount=");
        sbLIZ.append(this.lineCount);
        sbLIZ.append(", familyName='");
        sbLIZ.append(this.familyName);
        sbLIZ.append('\'');
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", backColor=");
        sbLIZ.append(this.backColor);
        sbLIZ.append(", isPlaceholder=");
        sbLIZ.append(this.isPlaceholder);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getBackColor() {
        return this.backColor;
    }

    public int getCharSize() {
        return this.charSize;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getLetterSpacing() {
        return this.letterSpacing;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public float getLineHeight() {
        return this.lineHeight;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public int getSplit() {
        return this.split;
    }

    public int getTextAlign() {
        return this.textAlign;
    }

    public long getTextColor() {
        return this.textColor;
    }

    public int getTextIndent() {
        return this.textIndent;
    }

    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public static BefTextLayout readFromByteArray(byte[][] bArr) {
        TEParcelWrapper tEParcelWrapper = new TEParcelWrapper(bArr[0]);
        BefTextLayout befTextLayout = new BefTextLayout();
        befTextLayout.setBackColor(tEParcelWrapper.readLong().longValue());
        befTextLayout.setCharSize(tEParcelWrapper.readInt());
        befTextLayout.setFamilyName(tEParcelWrapper.readString());
        befTextLayout.setLetterSpacing(tEParcelWrapper.readInt());
        befTextLayout.setLineCount(tEParcelWrapper.readInt());
        befTextLayout.setLineHeight(tEParcelWrapper.readInt());
        befTextLayout.setLineWidth(tEParcelWrapper.readInt());
        befTextLayout.setPlaceholder(tEParcelWrapper.readBoolean());
        befTextLayout.setSplit(tEParcelWrapper.readInt());
        befTextLayout.setTextAlign(tEParcelWrapper.readInt());
        befTextLayout.setTextColor(tEParcelWrapper.readLong().longValue());
        befTextLayout.setTextIndent(tEParcelWrapper.readInt());
        return befTextLayout;
    }

    public void setBackColor(long j) {
        this.backColor = j;
    }

    public void setCharSize(int i) {
        this.charSize = i;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setLetterSpacing(int i) {
        this.letterSpacing = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setLineHeight(float f) {
        this.lineHeight = f;
    }

    public void setLineWidth(int i) {
        this.lineWidth = i;
    }

    public void setPlaceholder(boolean z) {
        this.isPlaceholder = z;
    }

    public void setSplit(int i) {
        this.split = i;
    }

    public void setTextAlign(int i) {
        this.textAlign = i;
    }

    public void setTextColor(long j) {
        this.textColor = j;
    }

    public void setTextIndent(int i) {
        this.textIndent = i;
    }
}
