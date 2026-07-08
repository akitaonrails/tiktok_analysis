package ttpobfuscated;

import X.C1954807lC;
import X.C2097608Jq;
import X.C786410Ut5;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class cc {
    public final String a;
    public final Request b;
    public final long c;
    public final Map<String, String> d;

    public final Map<String, String> g() {
        Integer numC = this.b.c();
        if (numC != null) {
            Map<String, String> mapLJIILIIL = C2097608Jq.LJIILIIL(this.d, new Pair("x-tt-dataflow-id", String.valueOf(numC.intValue())));
            if (mapLJIILIIL != null) {
                return mapLJIILIIL;
            }
        }
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode() + ((C786410Ut5.Y2(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String i() {
        Request request = this.b;
        if (request instanceof Request.Http) {
            return "network";
        }
        if (request instanceof Request.Configuration) {
            return "settings";
        }
        if (request instanceof Request.Gecko) {
            return "gecko";
        }
        if (request instanceof Request.PreDefinedFlow) {
            return "predefined";
        }
        if (request instanceof Request.SDK) {
            return "sdk";
        }
        if (request instanceof Request.WebRouter) {
            return "webrouter";
        }
        if (request instanceof Request.SystemAPI) {
            return "systemAPI";
        }
        if (request instanceof Request.AppToApp) {
            return "apptoapp";
        }
        if (request instanceof Request.LiveVideo) {
            return "liveVideo";
        }
        if (request instanceof Request.LiveAudio) {
            return "liveAudio";
        }
        if (request instanceof Request.LiveSEI) {
            return "liveSei";
        }
        throw new C1954807lC();
    }

    public String toString() {
        return "RequestContext(requestType=" + this.a + ", request=" + this.b + ", startTime=" + this.c + ", metadata=" + this.d + ')';
    }

    public final String a() {
        return this.a;
    }

    public final Request b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.d;
    }

    public final Map<String, String> e() {
        return this.d;
    }

    public final Request f() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public final long j() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        if (Intrinsics.LJFF(this.a, ccVar.a) && Intrinsics.LJFF(this.b, ccVar.b) && this.c == ccVar.c && Intrinsics.LJFF(this.d, ccVar.d)) {
            return true;
        }
        return false;
    }

    public cc(String str, Request request, long j, Map<String, String> map) {
        this.a = str;
        this.b = request;
        this.c = j;
        this.d = map;
    }

    public final cc a(String str, Request request, long j, Map<String, String> map) {
        return new cc(str, request, j, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cc a(cc ccVar, String str, Request request, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ccVar.a;
        }
        if ((i & 2) != 0) {
            request = ccVar.b;
        }
        if ((i & 4) != 0) {
            j = ccVar.c;
        }
        if ((i & 8) != 0) {
            map = ccVar.d;
        }
        return ccVar.a(str, request, j, map);
    }
}
