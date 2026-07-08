package com.ss.android.ugc.aweme.internalshare.impl.sharetouser;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C05DR;
import X.C06PO;
import X.C098200Yq;
import X.C099G;
import X.C0PEM;
import X.C0QSJ;
import X.C0YTK;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1336205Ku;
import X.C1365810le7;
import X.C1391190mJ3;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1752206tc;
import X.C1752606tg;
import X.C1766306vt;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2241931Cox;
import X.C2296808zG;
import X.C23250099c;
import X.C338490DOt;
import X.C343950De5;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C438710HIf;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C462630ICf;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C913340ZsK;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1743406sC;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS137S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputAbility;
import com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputEditTextAbility;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareToUserSheet extends Fragment implements IInternalShareDirectInputAbility, InterfaceC724530SbT, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final C1752206tc LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiPSohJiQgOicyHELIOSOiBiICIjJGs/IS4hLTEjPDw2OmsfIS4hLREjHDw2OhYkLCon";
    public View LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 650));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 651));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 653));
    public IMContact LLIZLLLIL;
    public ByteString LLJ;
    public String LLJI;
    public Bundle LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public C099G LLJILLL;
    public boolean LLJJ;
    public TuxSheet LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareToUserSheet.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = new C1752206tc();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InternalShareDirectInputScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InternalShareDirectInputScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InternalShareDirectInputScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 645704262) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public ShareToUserSheet() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 654);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(391);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 655), aFwS229S0000000_2, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2((Fragment) this, 656), aFwS229S0000000_2, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 657), aFwS229S0000000_2, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 652));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputAbility
    public final void Jx() {
        String uid;
        String string;
        String string2;
        String text;
        BaseTemplate baseTemplateLIZLLL = C2241931Cox.LIZLLL(this.LLJ, DynamicCardTemplate.class);
        if (baseTemplateLIZLLL == null) {
            return;
        }
        C1752606tg c1752606tg = (C1752606tg) this.LLJJIJI.getValue();
        c1752606tg.getClass();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = c1752606tg.LIZ;
        if (bundle != null) {
            String string3 = bundle.getString("enter_from");
            if (string3 != null) {
                jSONObject.put("enter_from", string3);
            }
            String string4 = bundle.getString("enter_method");
            if (string4 != null) {
                jSONObject.put("enter_method", string4);
            }
            String string5 = bundle.getString("panel_source");
            if (string5 != null) {
                jSONObject.put("panel_source", string5);
            }
            String string6 = bundle.getString("content_type");
            if (string6 != null) {
                jSONObject.put("content_type", string6);
            }
            String string7 = bundle.getString("minis_content_type");
            if (string7 != null) {
                jSONObject.put("minis_content_type", string7);
            }
        }
        C20684815ws.LJIJ("share_video_to_chat", jSONObject);
        C1752606tg c1752606tg2 = (C1752606tg) this.LLJJIJI.getValue();
        c1752606tg2.getClass();
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle2 = c1752606tg2.LIZ;
        if (bundle2 != null) {
            String string8 = bundle2.getString("enter_from");
            if (string8 != null) {
                jSONObject2.put("enter_from", string8);
            }
            String string9 = bundle2.getString("enter_method");
            if (string9 != null) {
                jSONObject2.put("enter_method", string9);
            }
            String string10 = bundle2.getString("panel_source");
            if (string10 != null) {
                jSONObject2.put("panel_source", string10);
            }
            String string11 = bundle2.getString("content_type");
            if (string11 != null) {
                jSONObject2.put("content_type", string11);
            }
            String string12 = bundle2.getString("minis_content_type");
            if (string12 != null) {
                jSONObject2.put("minis_content_type", string12);
            }
        }
        C20684815ws.LJIJ("share_head_click_total", jSONObject2);
        String str = "";
        zJ("send", "");
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        IMContact iMContact = this.LLIZLLLIL;
        if (iMContact == null || (uid = iMContact.getUid()) == null) {
            uid = "";
        }
        String strLJJIIZ = imChatService.LJJIIZ(uid);
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        String str2 = this.LLJI;
        if (str2 == null) {
            str2 = "";
        }
        c874730YTfLIZ.LIZIZ.LJIIL = str2;
        IInternalShareDirectInputEditTextAbility iInternalShareDirectInputEditTextAbility = (IInternalShareDirectInputEditTextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IInternalShareDirectInputEditTextAbility.class, null);
        if (iInternalShareDirectInputEditTextAbility != null && (text = iInternalShareDirectInputEditTextAbility.getText()) != null && text.length() > 0) {
            c874730YTfLIZ.LIZIZ(TextContent.Companion.obtain(text, null, null, null, null, null));
        }
        c874730YTfLIZ.LIZJ(baseTemplateLIZLLL);
        c874730YTfLIZ.LIZIZ.LJFF = strLJJIIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle3 = this.LLJIJIL;
        if (bundle3 != null) {
            String string13 = bundle3.getString("enter_from");
            if (string13 != null) {
                linkedHashMap.put("enter_from", string13);
            }
            String string14 = bundle3.getString("enter_method");
            if (string14 != null) {
                linkedHashMap.put("enter_method", string14);
            }
            String string15 = bundle3.getString("panel_source");
            if (string15 != null) {
                linkedHashMap.put("panel_source", string15);
            }
            String string16 = bundle3.getString("content_type");
            if (string16 != null) {
                linkedHashMap.put("content_type", string16);
            }
            String string17 = bundle3.getString("minis_content_type");
            if (string17 != null) {
                linkedHashMap.put("minis_content_type", string17);
            }
        }
        c874730YTfLIZ.LIZIZ.LJIILIIL = linkedHashMap;
        c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.06td
            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
            }
        });
        IShareMessageToastHelper.LIZ.getClass();
        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
        if (iShareMessageToastHelperLIZ != null) {
            IMContact iMContact2 = this.LLIZLLLIL;
            if (iMContact2 == null) {
                return;
            }
            List listSingletonList = Collections.singletonList(iMContact2);
            Bundle bundle4 = this.LLJIJIL;
            if (bundle4 == null || (string = bundle4.getString("enter_from")) == null) {
                string = "";
            }
            Bundle bundle5 = this.LLJIJIL;
            if (bundle5 != null && (string2 = bundle5.getString("enter_method")) != null) {
                str = string2;
            }
            String strLIZ = C1766306vt.LIZ(Collections.singletonList(iMContact2));
            Bundle bundle6 = this.LLJIJIL;
            iShareMessageToastHelperLIZ.zs(new C1365810le7(listSingletonList, "minis_game", string, str, "", false, false, 0, strLIZ, null, null, bundle6 != null ? bundle6.getString("panel_source") : null, false, false, 13824));
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, new C343950De5() { // from class: X.06tf
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() throws IllegalAccessException {
        super.onDestroyView();
        SuppressPanelAutoSwitchAbility suppressPanelAutoSwitchAbility = (SuppressPanelAutoSwitchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), SuppressPanelAutoSwitchAbility.class, null);
        if (suppressPanelAutoSwitchAbility != null) {
            suppressPanelAutoSwitchAbility.rq0(false);
        }
        C1558520qew.LJIIJ(this, InternalShareDirectInputScope.class, IInternalShareDirectInputAbility.class, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        FrameLayout frameLayout;
        View viewFindViewById;
        FrameLayout frameLayout2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        RoundingCornerLayout roundingCornerLayout;
        TuxIconView tuxIconView;
        View viewFindViewById2;
        TextView textView;
        String displayName;
        C427660Gpo c427660Gpo;
        IMContact iMContact;
        UrlModel avatarThumb;
        C197039127h c197039127h;
        super.onViewCreated(view, bundle);
        View view2 = this.LL;
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.u2r);
        } else {
            frameLayout = null;
        }
        this.LLILLJJLI = frameLayout;
        View view3 = this.LL;
        if (view3 != null && (c197039127h = (C197039127h) view3.findViewById(R.id.up_)) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 40));
        }
        View view4 = this.LL;
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.gzl);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        C1558520qew.LJI(this, InternalShareDirectInputScope.class, this, IInternalShareDirectInputAbility.class, null, null);
        View view5 = this.LL;
        if (view5 != null && (c427660Gpo = (C427660Gpo) view5.findViewById(R.id.user_avatar)) != null && (iMContact = this.LLIZLLLIL) != null && (avatarThumb = iMContact.getAvatarThumb()) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
        }
        View view6 = this.LL;
        String str = "";
        if (view6 != null && (textView = (TextView) view6.findViewById(R.id.user_name)) != null) {
            IMContact iMContact2 = this.LLIZLLLIL;
            if (iMContact2 == null || (displayName = iMContact2.getDisplayName()) == null) {
                displayName = "";
            }
            textView.setText(displayName);
        }
        View view7 = this.LL;
        if (view7 != null && (viewFindViewById2 = view7.findViewById(R.id.user_area)) != null) {
            C786410Ut5.I7(new ACListenerS137S0100000_2(this, 41), viewFindViewById2);
        }
        View view8 = this.LL;
        if (view8 != null && (tuxIconView = (TuxIconView) view8.findViewById(R.id.e1y)) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 42));
        }
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        View view9 = this.LL;
        if (view9 != null && (roundingCornerLayout = (RoundingCornerLayout) view9.findViewById(R.id.f4y)) != null) {
            roundingCornerLayout.setRoundingParams(new C462630ICf(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ));
        }
        View view10 = this.LL;
        if (view10 != null) {
            C786410Ut5.I7(new ACListenerS137S0100000_2(this, 43), view10);
        }
        C723850SaN.LIZ(this, false, null, new AwS116S1100000_2(this, String.valueOf(hashCode()), 13), 3);
        View view11 = this.LL;
        if (view11 != null) {
            frameLayout2 = (FrameLayout) view11.findViewById(R.id.f4y);
        } else {
            frameLayout2 = null;
        }
        this.LLILLL = frameLayout2;
        FrameLayout frameLayout3 = this.LLILLJJLI;
        if (frameLayout3 != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJILJIL)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJILJILJ)));
            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ2;
                C786410Ut5.W5(frameLayout3, layoutParams);
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05DR(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06PO(this, null), 3);
        C1752606tg c1752606tg = (C1752606tg) this.LLJJIJI.getValue();
        c1752606tg.getClass();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle2 = c1752606tg.LIZ;
        if (bundle2 == null || (string = bundle2.getString("enter_from")) == null) {
            string = "";
        }
        jSONObject.put("enter_from", string);
        jSONObject.put("is_send_btn_show", 1);
        jSONObject.put("is_input_box_show", 1);
        C20684815ws.LJIJ("ttsocial_share_card_panel_show", jSONObject);
        C1752606tg c1752606tg2 = (C1752606tg) this.LLJJIJI.getValue();
        c1752606tg2.getClass();
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle3 = c1752606tg2.LIZ;
        if (bundle3 == null || (string2 = bundle3.getString("enter_from")) == null) {
            string2 = "";
        }
        jSONObject2.put("enter_from", string2);
        Bundle bundle4 = c1752606tg2.LIZ;
        if (bundle4 == null || (string3 = bundle4.getString("enter_method")) == null) {
            string3 = "";
        }
        jSONObject2.put("enter_method", string3);
        Bundle bundle5 = c1752606tg2.LIZ;
        if (bundle5 == null || (string4 = bundle5.getString("panel_source")) == null) {
            string4 = "";
        }
        jSONObject2.put("panel_source", string4);
        Bundle bundle6 = c1752606tg2.LIZ;
        if (bundle6 == null || (string5 = bundle6.getString("content_type")) == null) {
            string5 = "";
        }
        jSONObject2.put("content_type", string5);
        Bundle bundle7 = c1752606tg2.LIZ;
        if (bundle7 != null && (string6 = bundle7.getString("minis_content_type")) != null) {
            str = string6;
        }
        jSONObject2.put("minis_content_type", str);
        C20684815ws.LJIJ("share_head_show", jSONObject2);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputAbility
    public final void zJ(String str, String str2) {
        String string;
        C1752606tg c1752606tg = (C1752606tg) this.LLJJIJI.getValue();
        c1752606tg.getClass();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = c1752606tg.LIZ;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        jSONObject.put("enter_from", string);
        jSONObject.put("click_btn_type", str);
        jSONObject.put("input_box_click_area", str2);
        C20684815ws.LJIJ("ttsocial_share_card_panel_click", jSONObject);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cu_, viewGroup, false);
        this.LL = viewTd;
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
