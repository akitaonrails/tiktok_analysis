package com.bytedance.pitaya.cep_ast;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.pitaya.cep_engine.CepSubModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class CepASTLoader extends CepSubModule {
    public final String TAG = "CepASTLoader";

    @Override // com.bytedance.pitaya.cep_engine.CepSubModule
    public boolean load() {
        try {
            INVOKESTATIC_com_bytedance_pitaya_cep_ast_CepASTLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("CepAST");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void INVOKESTATIC_com_bytedance_pitaya_cep_ast_CepASTLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
