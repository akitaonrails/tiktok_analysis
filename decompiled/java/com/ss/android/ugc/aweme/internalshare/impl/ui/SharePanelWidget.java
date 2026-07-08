package com.ss.android.ugc.aweme.internalshare.impl.ui;

import X.C03H5;
import X.C06W7;
import X.C0I0B;
import X.C0I1X;
import X.C0WZX;
import X.C0ZE7;
import X.C0ZH5;
import X.C0ZP4;
import X.C1058570deZ;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1214160hhW;
import X.C1214170hhX;
import X.C1231720i9q;
import X.C1239104t3;
import X.C1308910kAL;
import X.C1356520lP8;
import X.C1362880lZO;
import X.C1363390laD;
import X.C1364590lc9;
import X.C1364620lcC;
import X.C1364640lcE;
import X.C1367430lgj;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C158700jB;
import X.C1599690rjL;
import X.C1602160rnK;
import X.C1606620ruW;
import X.C1700906lL;
import X.C1720006oQ;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C197039127h;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C310720CFy;
import X.C418440Gaw;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897520ZIw;
import X.DialogC1367400lgg;
import X.EnumC1910440zoY;
import X.InterfaceC0148002o;
import X.InterfaceC1356390lOv;
import X.InterfaceC1362900lZQ;
import X.InterfaceC1363370laB;
import X.InterfaceC1364650lcF;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1493505sz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.view.Widget;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelWidget extends Widget implements InterfaceC1356390lOv, InterfaceC1364650lcF, InterfaceC724530SbT, InterfaceC1363370laB {
    public final C1362880lZO LLILLJJLI;
    public final InterfaceC1362900lZQ LLILLL;
    public final Context LLILZ;
    public SharePanelViewModel LLILZIL;
    public RecyclerView LLILZLL;
    public C1363390laD LLIZ;
    public View LLIZLLLIL;
    public EditText LLJ;
    public RemoteImageView LLJI;
    public TuxIconView LLJIJIL;
    public C197039127h LLJILJIL;
    public LinearLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public C0I1X LLJJ;
    public ViewGroup LLJJI;
    public C1364640lcE LLJJIII;
    public C1214170hhX LLJJIJI;
    public C1214160hhW LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final int LLJJJIL;
    public boolean LLJJJJ;
    public final C1700906lL LLJJJJJIL;
    public final C897520ZIw LLJJJJLIIL;

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.common.view.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
    }

    public final void LJ() {
        String string = this.LLILZ.getString(2131835819, Integer.valueOf(LIZJ()));
        C1389890mGx c1389890mGx = new C1389890mGx(C1388190mED.LIZ(this.LLILZ));
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJIIJJI();
    }

    public final void LJI() {
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        if (sharePanelViewModel == null) {
            sharePanelViewModel = null;
        }
        if (sharePanelViewModel.LJIILL().isEmpty() && !this.LLJJIJIL) {
            View view = this.LLIZLLLIL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            C1214160hhW c1214160hhW = this.LLJJIJIIJIL;
            if (c1214160hhW != null && c1214160hhW.getVisibility() != 8) {
                int visibility = c1214160hhW.getVisibility();
                c1214160hhW.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1214160hhW);
            }
            ViewGroup viewGroup = this.LLJJI;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            EditText editText = this.LLJ;
            if (editText == null) {
                editText = null;
            }
            KeyboardUtils.LIZIZ(editText);
            if (this.LLILLJJLI.LIZIZ.LJIILJJIL()) {
                return;
            }
            ColorDrawable colorDrawable = new ColorDrawable(0);
            this.LLILLJJLI.LIZLLL.setBackground(colorDrawable);
            this.LLILLJJLI.LJ.setBackground(colorDrawable);
            View view2 = this.LLIZLLLIL;
            (view2 != null ? view2 : null).setPadding(0, 0, 0, 0);
            return;
        }
        LinearLayout linearLayout = this.LLJILLL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        if (linearLayout.getMinimumHeight() <= 0) {
            LinearLayout linearLayout2 = this.LLJILLL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            int height = linearLayout2.getHeight();
            LinearLayout linearLayout3 = this.LLJILLL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            linearLayout3.setMinimumHeight(height);
        }
        C1214160hhW c1214160hhW2 = this.LLJJIJIIJIL;
        if (c1214160hhW2 != null) {
            c1214160hhW2.LIZLLL();
        }
        ViewGroup viewGroup2 = this.LLJJI;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        C0I1X c0i1x = this.LLJJ;
        if (c0i1x != null) {
            C1364620lcC c1364620lcC = C1364620lcC.LIZ;
            SharePackage sharePackage = this.LLILLJJLI.LIZIZ;
            int i = c0i1x.LJII;
            Map mapLJ = C2097608Jq.LJ();
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            c1364620lcC.getClass();
            C1364620lcC.LJIIJ(sharePackage, i, null, mapLJ, interfaceC1493505szLIZIZ);
        }
        RemoteImageView remoteImageView = this.LLJI;
        if (remoteImageView == null) {
            remoteImageView = null;
        }
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        DialogC1367400lgg.LJJZ(remoteImageView, tuxIconView, this.LLILLJJLI.LIZIZ, Boolean.FALSE);
        int i2 = C1058570deZ.LIZ;
        SharePackage sharePackage2 = this.LLILLJJLI.LIZIZ;
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        C1058570deZ.LIZ(view3, sharePackage2);
        if (this.LLILLJJLI.LIZIZ.LJIILJJIL()) {
            return;
        }
        ColorDrawable colorDrawable2 = new ColorDrawable(536870911);
        this.LLILLJJLI.LIZLLL.setBackground(colorDrawable2);
        this.LLILLJJLI.LJ.setBackground(colorDrawable2);
        View view4 = this.LLIZLLLIL;
        (view4 != null ? view4 : null).setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
    }

    public final void LJIIIIZZ() {
        String strLIZIZ;
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        if (sharePanelViewModel == null) {
            sharePanelViewModel = null;
        }
        if (sharePanelViewModel.LLJJJJ) {
            return;
        }
        View viewFindViewById = findViewById(R.id.v0r);
        SharePanelViewModel sharePanelViewModel2 = this.LLILZIL;
        if (sharePanelViewModel2 == null) {
            sharePanelViewModel2 = null;
        }
        if (sharePanelViewModel2.LJIILL().isEmpty() && !this.LLJJIJIL) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C197039127h c197039127h = this.LLJILJIL;
            C786410Ut5.LLLLLLJ(c197039127h != null ? c197039127h : null, 8);
            C786410Ut5.LJZ(this.LLJJJIL, this.LLILLJJLI.LJ);
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h2, 0);
        C197039127h c197039127h3 = this.LLJILJIL;
        if (c197039127h3 == null) {
            c197039127h3 = null;
        }
        SharePanelViewModel sharePanelViewModel3 = this.LLILZIL;
        if (sharePanelViewModel3 == null) {
            sharePanelViewModel3 = null;
        }
        c197039127h3.setEnabled(sharePanelViewModel3.LJIILL().size() != 0);
        C197039127h c197039127h4 = this.LLJILJIL;
        if (c197039127h4 == null) {
            c197039127h4 = null;
        }
        SharePanelViewModel sharePanelViewModel4 = this.LLILZIL;
        if (sharePanelViewModel4 == null) {
            sharePanelViewModel4 = null;
        }
        if (sharePanelViewModel4.LJIILL().size() <= 1) {
            C197039127h c197039127h5 = this.LLJILJIL;
            strLIZIZ = (c197039127h5 != null ? c197039127h5 : null).getResources().getString(2131835796);
        } else {
            C1364640lcE c1364640lcE = this.LLJJIII;
            if (c1364640lcE == null || !c1364640lcE.isChecked()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C197039127h c197039127h6 = this.LLJILJIL;
                if (c197039127h6 == null) {
                    c197039127h6 = null;
                }
                sbLIZ.append(c197039127h6.getResources().getString(R.string.sxo));
                sbLIZ.append('(');
                SharePanelViewModel sharePanelViewModel5 = this.LLILZIL;
                sbLIZ.append((sharePanelViewModel5 != null ? sharePanelViewModel5 : null).LJIILL().size());
                sbLIZ.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = this.LLILZ.getString(2131835372);
            }
        }
        c197039127h4.setText(strLIZIZ);
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.SHARE_PANEL);
        return c0ze7;
    }

    @Override // com.ss.android.ugc.aweme.im.common.view.Widget
    public final void onDestroy() {
        C897520ZIw c897520ZIw = this.LLJJJJLIIL;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.view.Widget
    public final void onResume() {
        C897520ZIw c897520ZIw = this.LLJJJJLIIL;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    public final int LIZJ() {
        C310720CFy c310720CFyLIZIZ;
        if (((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).getProxy() == null || (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) == null) {
            return 10;
        }
        return c310720CFyLIZIZ.LIZ;
    }

    public final void LIZIZ(List<IMContact> list) {
        String strJ3;
        String string;
        String string2;
        String uid;
        String str;
        String string3;
        SharePackage sharePackage = this.LLILLJJLI.LIZIZ;
        sharePackage.extras.putInt("friends_shared_cnt", C1231720i9q.LIZ(list));
        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
        int size = list.size();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C1364620lcC.LJJ(sharePackage, null, size, interfaceC1493505szLIZIZ);
        EditText editText = this.LLJ;
        if (editText == null) {
            editText = null;
        }
        KeyboardUtils.LIZIZ(editText);
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                arrayList.add(iMContact);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BaseContact) it2.next()).getUid());
        }
        String string4 = arrayList2.toString();
        String strSubstring = string4.substring(1, string4.length() - 1);
        ArrayList arrayList3 = new ArrayList();
        for (IMContact iMContact2 : list) {
            if (iMContact2 instanceof IMConversation) {
                arrayList3.add(iMContact2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((IMConversation) it3.next()).getConversationId());
        }
        String string5 = arrayList4.toString();
        String strSubstring2 = string5.substring(1, string5.length() - 1);
        int size2 = arrayList.size();
        int size3 = list.size() - size2;
        Bundle bundle = this.LLILLJJLI.LIZIZ.extras;
        C786410Ut5.LJJJI("shareIdList", strSubstring, bundle);
        bundle.putStringArray("shared_users_id_list", (String[]) arrayList2.toArray(new String[0]));
        C786410Ut5.LJJJI("conversationIdList", strSubstring2, bundle);
        bundle.putStringArray("shared_conversation_id_list", (String[]) arrayList4.toArray(new String[0]));
        bundle.putInt("chat_cnt", size2);
        bundle.putInt("group_chat_cnt", size3);
        try {
            JSONObject jSONObject = new JSONObject();
            for (IMContact iMContact3 : list) {
                if (iMContact3 instanceof MAFIMUser) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("relation_tag", String.valueOf(((MAFIMUser) iMContact3).getFollowStatus()));
                    jSONObject2.put("rec_type", ((MAFIMUser) iMContact3).getRecType());
                    jSONObject.put(iMContact3.getUid(), jSONObject2);
                }
            }
            strJ3 = C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strJ3 = "";
        }
        if (strJ3.length() > 0) {
            C786410Ut5.LJJJI("rec_map", strJ3, this.LLILLJJLI.LIZIZ.extras);
        }
        C786410Ut5.LJJJI("source", "share", sharePackage.extras);
        IMSharePanelApi.LIZ.getClass();
        InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
        EditText editText2 = this.LLJ;
        if (editText2 == null) {
            editText2 = null;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9MzVy+Is7i", null));
        if (editableLLJILLL != null) {
            string = editableLLJILLL.toString();
        } else {
            string = null;
        }
        InterfaceC1362900lZQ interfaceC1362900lZQ = this.LLILLL;
        HashMap map = new HashMap();
        map.put("panel_source", "share_panel");
        shareService.LJJJ(sharePackage, string, list, interfaceC1362900lZQ, 1, null, map, null, true, null, C2097608Jq.LJ());
        EditText editText3 = this.LLJ;
        if (editText3 == null) {
            editText3 = null;
        }
        Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9MzVy+Is7i", null));
        if (editableLLJILLL2 != null) {
            string2 = editableLLJILLL2.toString();
        } else {
            string2 = null;
        }
        if (Intrinsics.LJFF(sharePackage.itemType, "aweme") || Intrinsics.LJFF(sharePackage.itemType, "aweme_photo") || Intrinsics.LJFF(sharePackage.itemType, "now_post") || Intrinsics.LJFF(sharePackage.itemType, "now_video") || Intrinsics.LJFF(sharePackage.itemType, "now_post_memory") || Intrinsics.LJFF(sharePackage.itemType, "now_video_memory")) {
            C1364590lc9 c1364590lc9 = C1364590lc9.LIZ;
            ArrayList arrayList5 = new ArrayList(list);
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC1493505sz interfaceC1493505szLIZIZ2 = C0I0B.LJFF.LIZIZ();
            c1364590lc9.getClass();
            C1364590lc9.LIZLLL(sharePackage, string2, arrayList5, jCurrentTimeMillis, interfaceC1493505szLIZIZ2, -1);
            InterfaceC1365380ldQ shareService2 = C1599690rjL.LIZ().getShareService();
            ArrayList arrayList6 = new ArrayList();
            for (IMContact iMContact4 : list) {
                if (iMContact4 instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact4;
                    if (!iMUser.isBlock() && iMUser.getFollowStatus() == 2 && (uid = iMContact4.getUid()) != null) {
                        arrayList6.add(uid);
                    }
                }
            }
            shareService2.LJJI(arrayList6);
        }
        if (Intrinsics.LJFF(sharePackage.extras.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT), "1")) {
            str = "livesdk_live_event_anchor_share_confirm";
        } else {
            str = "livesdk_live_event_user_share_confirm";
        }
        if (Intrinsics.LJFF("live_event", sharePackage.itemType)) {
            for (IMContact iMContact5 : list) {
                C1367430lgj c1367430lgj = C1367430lgj.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                InterfaceC1493505sz interfaceC1493505szLIZIZ3 = C0I0B.LJFF.LIZIZ();
                c1367430lgj.getClass();
                C1367430lgj.LJI(str, sharePackage, iMContact5, false, jCurrentTimeMillis2, interfaceC1493505szLIZIZ3);
            }
        }
        if (Intrinsics.LJFF(sharePackage.itemType, "comment")) {
            ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LIZJ("enter_from", "comment_panel");
        } else if (Intrinsics.LJFF(sharePackage.itemType, "live")) {
            ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LIZJ("enter_from", "live");
        } else if (Intrinsics.LJFF(sharePackage.itemType, "product")) {
            IEcommerceLogUtil iEcommerceLogUtil = (IEcommerceLogUtil) ServiceManager.get().getService(IEcommerceLogUtil.class);
            EditText editText4 = this.LLJ;
            if (editText4 == null) {
                editText4 = null;
            }
            Editable editableLLJILLL3 = C2204961BRm.LLJILLL(editText4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9MzVy+Is7i", null));
            if (editableLLJILLL3 != null) {
                string3 = editableLLJILLL3.toString();
            } else {
                string3 = null;
            }
            iEcommerceLogUtil.LIZLLL(sharePackage, string3, list);
        } else if (Intrinsics.LJFF(sharePackage.itemType, "paid_series")) {
            C0ZH5 c0zh5 = C0ZH5.LIZ;
            EditText editText5 = this.LLJ;
            if (editText5 == null) {
                editText5 = null;
            }
            String string6 = C2204961BRm.LLJILLL(editText5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9MzVy+Is7i", null)).toString();
            c0zh5.getClass();
            C0ZH5.LIZIZ(sharePackage, string6, list);
        }
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        if (sharePanelViewModel == null) {
            sharePanelViewModel = null;
        }
        sharePanelViewModel.getClass();
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJJIJIIJI(list);
    }

    public final void LIZLLL(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        C197039127h c197039127h = null;
        if (sharePanelViewModel == null) {
            sharePanelViewModel = null;
        }
        sharePanelViewModel.LLJJJJ = z;
        C1363390laD c1363390laD = this.LLIZ;
        if (c1363390laD == null) {
            c1363390laD = null;
        }
        c1363390laD.notifyDataSetChanged();
        C197039127h c197039127h2 = this.LLJILJIL;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        c197039127h2.setLoading(z);
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, this.LLILZ);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C197039127h c197039127h3 = this.LLJILJIL;
                if (c197039127h3 != null) {
                    c197039127h = c197039127h3;
                }
                c197039127h.setBackgroundColor(iIntValue);
                return;
            }
            return;
        }
        C1364640lcE c1364640lcE = this.LLJJIII;
        if (c1364640lcE != null) {
            c1364640lcE.LJIIJJI = false;
        }
        C197039127h c197039127h4 = this.LLJILJIL;
        if (c197039127h4 != null) {
            c197039127h = c197039127h4;
        }
        c197039127h.setBackgroundResource(R.drawable.c_q);
        LJIIIIZZ();
    }

    public final void LJII(List<? extends IMContact> list) {
        Integer numValueOf;
        List listLLIIII;
        if (this.LLJJJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePanelHead: ");
        C1363390laD c1363390laD = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1720006oQ.LJ("SharePanelWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty()) {
            C1239104t3.LIZ(true);
            if (list != null) {
                try {
                    listLLIIII = C13LP.LLIIII(list);
                } catch (ConcurrentModificationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    listLLIIII = C13BV.INSTANCE;
                }
            } else {
                listLLIIII = null;
            }
            C897520ZIw c897520ZIw = this.LLJJJJLIIL;
            if (c897520ZIw != null) {
                c897520ZIw.LJIIJJI(new C1356520lP8(listLLIIII, null));
            }
            C1363390laD c1363390laD2 = this.LLIZ;
            if (c1363390laD2 != null) {
                c1363390laD = c1363390laD2;
            }
            c1363390laD.LLJILJILJ(this, list);
            C1364620lcC c1364620lcC = C1364620lcC.LIZ;
            SharePackage sharePackage = this.LLILLJJLI.LIZIZ;
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            c1364620lcC.getClass();
            C1364620lcC.LJIJ(sharePackage, interfaceC1493505szLIZIZ);
            return;
        }
        C1239104t3.LIZ(false);
        C786410Ut5.LJLZ(8, this.LLILLJJLI.LIZJ);
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.LLILZIL;
        C1363390laD c1363390laD = null;
        if (sharePanelViewModel == null) {
            sharePanelViewModel = null;
        }
        sharePanelViewModel.LLJJJ = z;
        C1363390laD c1363390laD2 = this.LLIZ;
        if (c1363390laD2 != null) {
            c1363390laD = c1363390laD2;
        }
        c1363390laD.notifyDataSetChanged();
        LJIIIIZZ();
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        C1700906lL c1700906lL = this.LLJJJJJIL;
        if (c1700906lL != null) {
            DurationPerfMon.LIZ.LIZJ(c1700906lL, new C158700jB(list.size()));
        }
        C1720006oQ.LJ("SharePanelWidget", "onLoadComplete");
        LJII(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055f  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0I7D, X.127h] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
    /* JADX WARN: Type inference failed for: r9v34, types: [X.0hks, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SharePanelWidget(X.C1362880lZO r34, X.InterfaceC1362900lZQ r35) {
        /*
            Method dump skipped, instruction units count: 1391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelWidget.<init>(X.0lZO, X.0lZQ):void");
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
        C1700906lL c1700906lL = this.LLJJJJJIL;
        if (c1700906lL != null) {
            DurationPerfMon.LIZ.LIZJ(c1700906lL, new C158700jB(list.size()));
        }
        if (C06W7.LIZIZ(this.LLILZ)) {
            C1388190mED.LIZ(this.LLILZ).runOnUiThread(new ARunnableS90S0200000_21(list, this, 56));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0344 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033d  */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    @Override // X.InterfaceC1356390lOv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelWidget.eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean):boolean");
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
