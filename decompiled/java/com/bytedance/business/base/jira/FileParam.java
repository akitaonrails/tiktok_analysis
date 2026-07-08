package com.bytedance.business.base.jira;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FileParam implements Serializable {
    public String content;
    public String name;
    public int type;

    public String getContent() {
        return this.content;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public static FileParam obtainImg(String str) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName("img");
        fileParam.setType(2);
        return fileParam;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public static FileParam obtainTxt(String str, String str2) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName(str2);
        fileParam.setType(1);
        return fileParam;
    }

    public static FileParam obtainTxtFile(String str, String str2) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str);
        fileParam.setName(str2);
        fileParam.setType(3);
        return fileParam;
    }

    public static FileParam obtain(String str, String str2, int i) {
        FileParam fileParam = new FileParam();
        fileParam.setContent(str2);
        fileParam.setName(str);
        fileParam.setType(i);
        return fileParam;
    }
}
