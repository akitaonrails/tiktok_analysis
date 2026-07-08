package com.ss.android.ugc.aweme.compliance.api.services.privacy;

import X.AbstractC1549150qPp;
import X.C0CCZ;
import X.C106C;
import X.C1381570m3X;
import X.C19EG;
import X.InterfaceC742660TBg;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public interface IPrivacyService {
    void LIZ(Context context, FragmentManager fragmentManager, String str);

    InterfaceC742660TBg LIZIZ();

    boolean LIZJ();

    void LIZLLL(C19EG c19eg);

    boolean LJ();

    boolean LJFF();

    C0CCZ LJI();

    boolean LJII();

    PrivacyUserSettingsV2 LJIIIIZZ();

    PrivacySettingsRestrictionItem LJIIIZ(int i, String str);

    boolean LJIIJ();

    boolean LJIIJJI();

    C106C LJIIL(String str);

    void LJIILIIL(String str, ViewGroup viewGroup);

    void LJIILJJIL();

    void LJIILL(JSONObject jSONObject);

    List LJIILLIIL(Context context, AbsSceneAdaptationScene absSceneAdaptationScene, AbsSceneAdaptationScene absSceneAdaptationScene2);

    void LJIIZILJ(Context context, LifecycleOwner lifecycleOwner, JSONObject jSONObject);

    void LJIJ(String str);

    void LJIJI(Integer num, String str, Map map);

    void LJIJJ(Context context, String str, Function0<Unit> function0);

    void LJIJJLI(JSONObject jSONObject);

    boolean LJIL();

    boolean LJJ();

    void LJJI(String str);

    boolean LJJIFFI();

    void LJJII(C19EG c19eg);

    boolean LJJIII();

    void LJJIIJ(String str);

    void LJJIIJZLJL(String str);

    boolean LJJIIZ();

    void LJJIIZI(Aweme aweme, Collection<? extends Comment> collection);

    PrivacySettingsAgreementRecord LJJIJ(String str);

    boolean LJJIJIIJI();

    void LJJIJIIJIL();

    void LJJIJIL(List<C1381570m3X> list);

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
