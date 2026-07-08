package com.ss.android.ugc.aweme.compliance.api.services.businesses;

import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.C06MW;
import X.C0CCZ;
import X.C0HTT;
import X.C0QBA;
import X.C0TGX;
import X.C0WT3;
import X.C1390810mIR;
import X.C13IQ;
import X.C1916400zyA;
import X.C19EG;
import X.EnumC1916460zyG;
import X.InterfaceC1916320zy2;
import X.InterfaceC855080XgY;
import Y.AObjectS289S0200000_14;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.tns.AnsaPromptModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public interface IComplianceBusinessService {
    boolean LIZ(String str);

    boolean LIZIZ(String str);

    boolean LIZJ(String str);

    boolean LIZLLL(String str);

    boolean LJ(String str);

    void LJFF();

    int LJI();

    Object LJII();

    boolean LJIIIIZZ(String str);

    void LJIIIZ(EnumC1916460zyG enumC1916460zyG, boolean z);

    boolean LJIIJ(boolean z);

    void LJIIJJI();

    void LJIIL(C19EG c19eg);

    boolean LJIILIIL(EnumC1916460zyG enumC1916460zyG);

    String LJIILJJIL();

    C13IQ<? extends AbstractC738140SxQ> LJIILL();

    void LJIILLIIL(int i, Function0<Unit> function0);

    void LJIIZILJ(Context context);

    int LJIJ();

    boolean LJIJI();

    boolean LJIJJ(boolean z);

    void LJIJJLI(ViewGroup viewGroup, C0TGX c0tgx);

    Spanned LJIL(Context context, TextWithInlineLink textWithInlineLink);

    void LJJ(String str, String str2, String str3, String str4);

    Fragment LJJI(boolean z, C1916400zyA c1916400zyA);

    boolean LJJIFFI();

    boolean LJJII();

    MutableLiveData LJJIII();

    void LJJIIJ(Context context, C0HTT<? extends IEvent> c0htt, Aweme aweme, boolean z);

    boolean LJJIIJZLJL();

    C13IQ<? extends AbstractC738140SxQ> LJJIIZ();

    boolean LJJIIZI();

    boolean LJJIJ();

    C0CCZ LJJIJIIJI();

    Class<?> LJJIJIIJIL();

    void LJJIJIL(C19EG c19eg, C1390810mIR c1390810mIR, boolean z, boolean z2);

    Object LJJIJL();

    boolean LJJIJLIJ(boolean z);

    void LJJIL(Fragment fragment, C19EG c19eg, String str, String str2, View view, String str3, Function0<Unit> function0);

    void LJJIZ(Context context);

    boolean LJJJ();

    boolean LJJJI();

    void LJJJIL(boolean z);

    C0WT3 LJJJJ();

    void LJJJJI(AObjectS289S0200000_14 aObjectS289S0200000_14);

    int LJJJJIZL();

    InterfaceC855080XgY LJJJJJ(AnsaPromptModel ansaPromptModel);

    void LJJJJJL(C19EG c19eg, String str, String str2);

    void LJJJJL(C0QBA c0qba);

    C06MW LJJJJLI(Context context, int i, String str, String str2, String str3, InterfaceC1916320zy2 interfaceC1916320zy2);

    void LJJJJLL(Aweme aweme, Function1<? super Boolean, Unit> function1);

    List<C0CCZ> LJJJJZ();

    MutableLiveData LJJJJZI();

    boolean P9();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList();
}
