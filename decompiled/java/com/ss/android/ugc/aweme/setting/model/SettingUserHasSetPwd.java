package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public class SettingUserHasSetPwd {

    @C09CT("data")
    public Data data;

    @C09CT("message")
    public String message;

    public static class Data {

        @C09CT("captcha")
        public String captcha;

        @C09CT("description")
        public String description;

        @C09CT("error_code")
        public int errorCode;

        @C09CT("has_set")
        public boolean hasSet;
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
