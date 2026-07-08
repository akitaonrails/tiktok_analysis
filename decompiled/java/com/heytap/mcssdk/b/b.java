package com.heytap.mcssdk.b;

import X.C2188811AlT;
import com.heytap.msp.push.mode.BaseMode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b extends BaseMode {
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h = -2;
    public String i;
    public String j;

    public static <T> String a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("&");
        }
        return sb.toString();
    }

    public String a() {
        return this.b;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.c;
    }

    public void b(int i) {
        this.h = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public String d() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int e() {
        return this.f;
    }

    public void e(String str) {
        this.g = str;
    }

    public String f() {
        return this.g;
    }

    public void f(String str) {
        this.j = str;
    }

    public int g() {
        return this.h;
    }

    public void g(String str) {
        this.i = str;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4105;
    }

    public String h() {
        return this.j;
    }

    public String i() {
        return this.i;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallBackResult{, mRegisterID='");
        sbLIZ.append(this.d);
        sbLIZ.append('\'');
        sbLIZ.append(", mSdkVersion='");
        sbLIZ.append(this.e);
        sbLIZ.append('\'');
        sbLIZ.append(", mCommand=");
        sbLIZ.append(this.f);
        sbLIZ.append('\'');
        sbLIZ.append(", mContent='");
        sbLIZ.append(this.g);
        sbLIZ.append('\'');
        sbLIZ.append(", mAppPackage=");
        sbLIZ.append(this.i);
        sbLIZ.append('\'');
        sbLIZ.append(", mResponseCode=");
        sbLIZ.append(this.h);
        sbLIZ.append(", miniProgramPkg=");
        sbLIZ.append(this.j);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
