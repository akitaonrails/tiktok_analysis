package com.ss.android.ugc.aweme.api.pipeline;

import X.C531370Ksh;
import X.EnumC1412640mre;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ITemplateAlbumService {
    TemplateSlot LIZ(String str);

    int LIZIZ(String str, EnumC1412640mre enumC1412640mre);

    String LIZJ(int i, int i2, Context context);

    Object LIZLLL(Activity activity, String str, InterfaceC1364105Vn<? super C531370Ksh> interfaceC1364105Vn);

    boolean LJ(String str);

    String LJFF();

    int LJI(String str, EnumC1412640mre enumC1412640mre);

    void LJII(String str);

    String LJIIIIZZ(Context context, int i, ShortVideoContext shortVideoContext, int i2, boolean z, int i3, int i4);

    List<TemplateSlot> LJIIIZ(String str, EnumC1412640mre enumC1412640mre);

    int LJIIJ(String str, EnumC1412640mre enumC1412640mre);
}
