package com.ss.android.ugc.effectmanager.common.model;

import X.C0UER;
import X.C0UES;
import java.io.Serializable;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public class ModelV2 implements Serializable {
    public String _name;
    public String file_type;
    public String model_type;
    public String name;
    public String name_sec;
    public String signature_uri;
    public int status;
    public int type;
    public String uri;
    public String url_suffix;
    public String version;
    public String zip_uri;

    public ModelV2() {
        this("", "", "", 0, "", "", "", 1, "", "", "");
    }

    public String getName() {
        String strDecrypt;
        if (a0.LJJJIL(this._name) && (!a0.LJJJIL(getName_sec()))) {
            C0UES c0ues = C0UER.LIZ;
            if (c0ues == null || (strDecrypt = c0ues.decrypt(getName_sec())) == null) {
                strDecrypt = "";
            }
            this._name = strDecrypt;
        }
        return a0.LJJJIL(this._name) ? this.name : this._name;
    }

    public String getFile_type() {
        return this.file_type;
    }

    public String getModel_type() {
        return this.model_type;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public String getSignature_uri() {
        return this.signature_uri;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrl_suffix() {
        return this.url_suffix;
    }

    public String getVersion() {
        return this.version;
    }

    public String getZip_uri() {
        return this.zip_uri;
    }

    public void setFile_type(String str) {
        this.file_type = str;
    }

    public void setModel_type(String str) {
        this.model_type = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_sec(String str) {
        this.name_sec = str;
    }

    public void setSignature_uri(String str) {
        this.signature_uri = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_suffix(String str) {
        this.url_suffix = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setZip_uri(String str) {
        this.zip_uri = str;
    }

    public ModelV2(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, String str9) {
        this._name = str;
        this.name_sec = str2;
        this.version = str3;
        this.type = i;
        this.uri = str4;
        this.zip_uri = str5;
        this.url_suffix = str6;
        this.status = i2;
        this.file_type = str7;
        this.signature_uri = str8;
        this.model_type = str9;
        this.name = "";
    }
}
