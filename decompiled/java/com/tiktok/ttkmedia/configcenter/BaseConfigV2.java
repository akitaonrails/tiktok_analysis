package com.tiktok.ttkmedia.configcenter;

import X.C1467880oIk;
import X.InterfaceC1467440oI2;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class BaseConfigV2 implements InterfaceC1467440oI2 {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public static native float _getFloatOptionByDomain(int i, String str, String str2, int i2, int i3);

    public static native int _getIntOptionByDomain(int i, String str, String str2, int i2, int i3);

    public static native long _getLongOptionByDomain(int i, String str, String str2, int i2, int i3);

    public static native String _getStringOptionByDomain(int i, String str, String str2, int i2, int i3);

    @Override // X.InterfaceC1467560oIE
    public final /* synthetic */ C1467880oIk LJ(int i, JSONObject jSONObject) {
        return null;
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LJI() {
        return null;
    }

    @Override // X.InterfaceC1467440oI2
    public final void LJII() {
        throw null;
    }

    @Override // X.InterfaceC1467440oI2
    public final long getNativeHandle() {
        return 0L;
    }

    @Override // X.InterfaceC1467440oI2
    public final void release() {
    }

    @Override // X.InterfaceC1467440oI2
    public final Map<Integer, C1467880oIk> LIZLLL() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC1699160uJm
    public final int LJIIIIZZ(int i) {
        return _getIntOptionByDomain(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, i);
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZ(int i, String str) {
        return C1467880oIk.LIZIZ;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZIZ(int i, long j) {
        return C1467880oIk.LIZIZ;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZJ(int i, int i2) {
        return C1467880oIk.LIZIZ;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LJFF(float f, int i) {
        return C1467880oIk.LIZIZ;
    }

    public BaseConfigV2(int i, String str, int i2) {
        this.LIZIZ = i;
        this.LIZJ = str == null ? "" : str;
        this.LIZLLL = "";
        this.LJ = i2;
    }
}
