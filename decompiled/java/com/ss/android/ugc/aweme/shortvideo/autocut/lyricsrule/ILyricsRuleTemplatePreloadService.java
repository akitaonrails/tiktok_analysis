package com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule;

import X.C05WK;
import X.C0EQL;
import X.InterfaceC1364105Vn;
import X.InterfaceC1437705jz;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public interface ILyricsRuleTemplatePreloadService {
    AVMusic LIZ(String str, String str2);

    Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn);

    boolean LIZJ(String str, String str2);

    String LIZLLL(String str, String str2);

    void LJ(Context context, String str, String str2, InterfaceC1437705jz<AVMusic> interfaceC1437705jz, String str3);

    float LJFF(String str, String str2);

    Pair<List<C0EQL>, C05WK> LJI(String str, String str2);

    boolean LJII(String str, String str2);

    Object LJIIIIZZ(String str, String str2, InterfaceC1364105Vn<? super AVMusic> interfaceC1364105Vn);
}
