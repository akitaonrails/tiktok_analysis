package com.ss.android.ugc.aweme.api.pipeline;

import X.C0E4S;
import X.C0L1W;
import X.C1412390mrF;
import X.C1734980vFY;
import X.C19EG;
import X.C532520KuY;
import X.EnumC1412640mre;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ITemplateConsumeService {
    boolean LIZ(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig);

    boolean LIZIZ();

    Object LIZJ(String str, List<C0E4S> list, Intent intent, C532520KuY c532520KuY, InterfaceC1364105Vn<? super C0L1W> interfaceC1364105Vn);

    C1734980vFY LIZLLL(C19EG c19eg);

    void LJ(Activity activity, EnumC1412640mre enumC1412640mre, ShortVideoContext shortVideoContext, C1412390mrF c1412390mrF, String str);

    boolean LJFF(int i, EnumC1412640mre enumC1412640mre, TemplateAnchorConfig templateAnchorConfig, String str);

    boolean LJI(Activity activity, TemplateAnchorConfig templateAnchorConfig);
}
