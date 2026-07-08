package com.facebook;

import X.C1BJ6;
import X.C1BJH;
import X.C1BJO;
import X.C1BK5;
import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class FacebookRequestError implements Parcelable {
    public final Object batchRequestResult;
    public final C1BJH category;
    public final HttpURLConnection connection;
    public final int errorCode;
    public final String errorMessage;
    public final String errorRecoveryMessage;
    public final String errorType;
    public final String errorUserMessage;
    public final String errorUserTitle;
    public C1BJO exception;
    public final JSONObject requestResult;
    public final JSONObject requestResultBody;
    public final int requestStatusCode;
    public final int subErrorCode;
    public static final C1BJ6 Companion = new C1BJ6();
    public static final C1BK5 HTTP_RANGE_SUCCESS = new Object() { // from class: X.1BK5
    };
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C1D13(1);

    public /* synthetic */ FacebookRequestError() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String LIZ() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        C1BJO c1bjo = this.exception;
        if (c1bjo == null) {
            return null;
        }
        return c1bjo.getLocalizedMessage();
    }

    public final String toString() {
        return "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + LIZ() + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        C1BJO c1bjo;
        if (exc instanceof C1BJO) {
            c1bjo = (C1BJO) exc;
        } else {
            c1bjo = new C1BJO(exc);
        }
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, c1bjo, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestStatusCode);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.subErrorCode);
        parcel.writeString(this.errorType);
        parcel.writeString(LIZ());
        parcel.writeString(this.errorUserTitle);
        parcel.writeString(this.errorUserMessage);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FacebookRequestError(int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, org.json.JSONObject r13, org.json.JSONObject r14, java.lang.Object r15, java.net.HttpURLConnection r16, X.C1BJO r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection, X.1BJO, boolean):void");
    }
}
