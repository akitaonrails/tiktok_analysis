package com.ss.android.ugc.aweme.service;

import X.C1573890r3j;
import X.C1613690s5v;
import X.C19EG;
import X.EnumC1578890rBn;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public interface MiniDramaHostService {
    public static final C1573890r3j LIZ = C1573890r3j.LIZ;

    void LIZ();

    void LIZIZ(Context context, String str);

    void LIZJ(Context context, Aweme aweme);

    <T> T LIZLLL(Class<T> cls);

    Aweme LJ();

    Map<EnumC1578890rBn, Integer> LJFF();

    void LJI(String str, AwS425S0200000_24 awS425S0200000_24, AwS425S0200000_24 awS425S0200000_242, AwS233S0300000_24 awS233S0300000_24);

    void LJII(Context context);

    TuxSheet LJIIIIZZ(FragmentManager fragmentManager, C1613690s5v c1613690s5v, AwS568S0100000_24 awS568S0100000_24);

    int LJIIIZ(String str);

    boolean LJIIJ(C19EG c19eg);

    Gson getGson();
}
