package com.ss.android.ugc.aweme.commerce.tools.tcm.service;

import X.AbstractC23140094w;
import X.AbstractC856620Xj2;
import X.C127K;
import X.C15N1;
import X.C19EG;
import X.C20507315Mh;
import X.C20507415Mi;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public interface ICommerceToolsTcmService {
    void LIZ(JSONObject jSONObject);

    CommerceTcmPublishModule LIZIZ(AbstractC856620Xj2 abstractC856620Xj2);

    Object LIZJ(Fragment fragment, Aweme aweme, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void LIZLLL(Context context, CommerceToolsTcmModel commerceToolsTcmModel, AwS610S0100000_31 awS610S0100000_31);

    void LJ(C127K c127k, C19EG c19eg, VideoPublishEditModel videoPublishEditModel);

    void LJFF(Context context, C20507315Mh c20507315Mh, C20507415Mi c20507415Mi);

    void LJI(Context context, String str);

    boolean LJII(Context context, boolean z, boolean z2, boolean z3, List list, CommerceToolsTcmModel commerceToolsTcmModel, BrandedContentSwitchStatus brandedContentSwitchStatus, int i);

    void LJIIIIZZ(Activity activity, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i);

    boolean LJIIIZ();

    boolean LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL(boolean z, boolean z2);

    Object LJIILIIL(Activity activity, AwemeDraft awemeDraft, String str, AbstractC23140094w abstractC23140094w);

    void LJIILJJIL(CommerceToolsTcmModel commerceToolsTcmModel, C15N1 c15n1);

    void LJIILL(CommerceToolsTcmModel commerceToolsTcmModel);

    void LJIILLIIL(ViewStub viewStub, boolean z, boolean z2);

    boolean LJIIZILJ();

    void LJIJ(Fragment fragment, ViewStub viewStub, CommerceToolsTcmModel commerceToolsTcmModel, boolean z, boolean z2, boolean z3, int i, VideoPublishEditModel videoPublishEditModel);

    void LJIJI(BCPageModel bCPageModel);

    void clear();
}
