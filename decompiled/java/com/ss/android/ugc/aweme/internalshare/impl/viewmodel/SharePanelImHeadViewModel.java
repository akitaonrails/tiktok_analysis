package com.ss.android.ugc.aweme.internalshare.impl.viewmodel;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C054G;
import X.C0CFM;
import X.C0I0B;
import X.C0SUC;
import X.C0XQ7;
import X.C123100dR;
import X.C1234690iEd;
import X.C1336205Ku;
import X.C1360460lVU;
import X.C1362630lYz;
import X.C1363150lZp;
import X.C1363170lZr;
import X.C1363200lZu;
import X.C1363280la2;
import X.C1363310la5;
import X.C1363320la6;
import X.C1363350la9;
import X.C1363710laj;
import X.C1364620lcC;
import X.C1367430lgj;
import X.C1370970lmR;
import X.C1375730lu7;
import X.C1382810m5X;
import X.C1389890mGx;
import X.C13BV;
import X.C1402360mb4;
import X.C15438062q;
import X.C1606620ruW;
import X.C1618440sDa;
import X.C1906580ziK;
import X.C19EG;
import X.C20271514Tp;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2096308Jd;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C298460Bmu;
import X.C310720CFy;
import X.C621180OYa;
import X.C786410Ut5;
import X.C830490Whz;
import X.EnumC1362640lZ0;
import X.InterfaceC1356390lOv;
import X.InterfaceC1362600lYw;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1369790lkX;
import X.InterfaceC1493505sz;
import X.InterfaceC1618460sDc;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS43S2100000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelImHeadViewModel extends ViewModel implements InterfaceC1356390lOv, GenericLifecycleObserver {
    public final SharePackage LL;
    public final List<InterfaceC1369790lkX> LLILLJJLI;
    public final InterfaceC1362600lYw LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData<Boolean> LLILZLL;
    public final MutableLiveData<Pair<Boolean, Integer>> LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData<Pair<Boolean, Integer>> LLJ;
    public final MutableLiveData<Set<IMContact>> LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData<Pair<IMContact, Boolean>> LLJILJILJ;
    public final MutableLiveData<Pair<List<IMContact>, Boolean>> LLJILLL;
    public final MutableLiveData<Boolean> LLJJ;
    public final MutableLiveData<Boolean> LLJJI;
    public final MutableLiveData<Pair<IMContact, Boolean>> LLJJIII;
    public final MutableLiveData<Pair<List<IMContact>, Boolean>> LLJJIJI;
    public final C054G LLJJIJIIJIL;
    public final SharePanelViewModel LLJJIJIL;
    public String LLJJJ;

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void AQ2() {
        if (this.LLJJIJIL.LJIILIIL() == C0CFM.FIRST) {
            this.LLJ.setValue(new Pair<>(Boolean.TRUE, Integer.valueOf((!this.LLJJIJIL.LJII() || ((Boolean) C1382810m5X.LIZIZ.getValue()).booleanValue()) ? 0 : 1)));
        } else if (this.LLJJIJIL.LJIILIIL() == C0CFM.LAST) {
            this.LLJ.setValue(new Pair<>(Boolean.TRUE, -1));
        }
    }

    public final void te0() {
        C19EG c19eg;
        if (!Intrinsics.LJFF(this.LL.itemType, "aigc_avatar")) {
            Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LL);
            if (awemeLJJIJIL == null) {
                return;
            }
            this.LLILLL.LJIILIIL();
            InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                interfaceC1618460sDcLJIJJLI.LJIIJ(new C20271514Tp(activityLJFF, awemeLJJIJIL, this.LLJJIJIL.LJIIL(), null, null, null, 0, C1375730lu7.LIZIZ.LJI(), null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031672));
            }
            interfaceC1618460sDcLJIJJLI.LJI(awemeLJJIJIL, "share_to_story_click", new AwS43S2100000_21(this, this.LL.extras.getString("share_to_story_enter_method", ""), this.LL.extras.getString("share_to_story_entrance_icon", ""), 0));
            return;
        }
        C1364620lcC.LJII(C1364620lcC.LIZ);
        Bundle bundle = this.LL.extras;
        String string = bundle.getString("uncrop_avatar_path", "");
        String string2 = bundle.getString("origin_no_crop_avatar_path", "");
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_aivatar", true);
        C786410Ut5.LJJJI("origin_avatar_url", string, bundle2);
        C786410Ut5.LJJJI("origin_no_crop_avatar_path", string2, bundle2);
        C786410Ut5.LJJJI("enter_method", "share_panel_post", bundle2);
        Activity activityLJFF2 = C2214201BlK.LJFF();
        if (!(activityLJFF2 instanceof C19EG) || (c19eg = (C19EG) activityLJFF2) == null) {
            return;
        }
        IAvatarPublishStoryService.DefaultImpls.publishDirectly$default(((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService(), c19eg, bundle2, false, false, new AwS565S0100000_21(this, 1672), 8, null);
    }

    public final void xQ2() {
        MutableLiveData<Boolean> mutableLiveData = this.LLILZ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LLILZLL.setValue(bool);
        this.LLILZIL.setValue(bool);
        this.LLJIJIL.setValue(bool);
        this.LLJILJIL.setValue(bool);
        this.LLJJ.setValue(bool);
        this.LLJJI.setValue(bool);
        Set<IMContact> value = this.LLJI.getValue();
        if (value != null) {
            value.clear();
        }
    }

    public final void zQ2() {
        SharePanelViewModel sharePanelViewModel = this.LLJJIJIL;
        if (sharePanelViewModel.LJIILLIIL()) {
            int iLIZ = ForwardLimitSetting.LIZ(sharePanelViewModel.LJIILJJIL());
            int iLJIIL = ((InterfaceC1365380ldQ) sharePanelViewModel.LLJLL.getValue()).LJIIL(sharePanelViewModel.LJIILJJIL(), sharePanelViewModel.LJIIIZ());
            if (iLIZ >= 0) {
                if (iLJIIL >= 0) {
                    if (sharePanelViewModel.LJIILL().size() < Math.min(iLIZ, iLJIIL) - 1) {
                        return;
                    }
                } else if (sharePanelViewModel.LJIILL().size() < iLIZ - 1) {
                    return;
                }
                this.LLIZLLLIL.setValue(Boolean.TRUE);
            }
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ(this.LLJJIJIIJIL, null);
        xQ2();
    }

    public final int wQ2() {
        C310720CFy c310720CFyLIZIZ;
        if (((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).getProxy() == null || (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) == null) {
            return 10;
        }
        return c310720CFyLIZIZ.LIZ;
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
        this.LLJJIII.setValue(new Pair<>(iMContact, Boolean.TRUE));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        String string;
        this.LLJJIJI.setValue(new Pair<>(list, Boolean.FALSE));
        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
        SharePackage sharePackage = this.LL;
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        String string2 = null;
        if (sharePackage != null) {
            Bundle bundle = sharePackage.extras;
            if (bundle != null && (string = bundle.getString("button_source", null)) != null) {
                string2 = string;
            } else {
                Bundle bundle2 = sharePackage.extras;
                if (bundle2 != null) {
                    string2 = bundle2.getString("enter_method");
                }
            }
        }
        c830490Whz.put("panel_source", string2);
        c830490Whz.put("count", String.valueOf(list.size()));
        Iterator<? extends IMContact> it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it2.hasNext()) {
            String strLIZJ = C1364620lcC.LIZJ(it2.next(), "");
            switch (strLIZJ.hashCode()) {
                case -2081423875:
                    if (strLIZJ.equals("recent chat")) {
                        i3++;
                    } else {
                        continue;
                    }
                    break;
                case -84854310:
                    if (strLIZJ.equals("recent share")) {
                        i++;
                    } else {
                        continue;
                    }
                    break;
                case -14974642:
                    if (strLIZJ.equals("recent send to")) {
                        i2++;
                    } else {
                        continue;
                    }
                    break;
                case 107858:
                    if (strLIZJ.equals("maf")) {
                        i5++;
                    } else {
                        continue;
                    }
                    break;
                case 108478:
                    if (!strLIZJ.equals("muf")) {
                    }
                    break;
                case 765915793:
                    if (!strLIZJ.equals("following")) {
                    }
                    break;
            }
            i4++;
        }
        c830490Whz.put("recent_share_count", String.valueOf(i));
        c830490Whz.put("recent_send_count", String.valueOf(i2));
        c830490Whz.put("recent_chat_count", String.valueOf(i3));
        c830490Whz.put("local_contact_count", String.valueOf(i4));
        c830490Whz.put("maf_count", String.valueOf(i5));
        C20684815ws.LJIILLIIL("internal_share_panel_available_user", c830490Whz);
        this.LLJI.setValue(this.LLJJIJIL.LJIILL());
        if (this.LLJJIJIL.LJII() && !((Boolean) C1382810m5X.LIZIZ.getValue()).booleanValue()) {
            this.LLILZLL.setValue(Boolean.TRUE);
        }
        zQ2();
        AQ2();
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list2) {
            if (vQ2(iMContact, true, null)) {
                arrayList.add(iMContact);
                yQ2(iMContact, true);
            }
        }
        this.LLJI.setValue(this.LLJJIJIL.LJIILL());
        MutableLiveData<Pair<List<IMContact>, Boolean>> mutableLiveData = this.LLJILLL;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(new Pair<>(arrayList, bool));
        if (this.LLJJIJIL.LJII() && !((Boolean) C1382810m5X.LIZIZ.getValue()).booleanValue()) {
            this.LLILZLL.setValue(bool);
        }
        zQ2();
        AQ2();
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        SharePanelImHeadViewModel sharePanelImHeadViewModel;
        SharePanelImHeadViewModel sharePanelImHeadViewModel2;
        SharePanelImHeadViewModel sharePanelImHeadViewModel3;
        Activity activityLIZIZ;
        RecReasonEntry recReasonTag;
        RecReasonsStruct recReasonsStruct;
        String strLLIFFJFJJ;
        List<UpvoteStruct> list;
        String uid;
        String requestId;
        if (iMContact instanceof C1363150lZp) {
            sharePanelImHeadViewModel = this;
        } else {
            sharePanelImHeadViewModel = null;
        }
        if (sharePanelImHeadViewModel != null) {
            this.LLILZ.setValue(Boolean.TRUE);
            return false;
        }
        if (iMContact instanceof C1363320la6) {
            sharePanelImHeadViewModel2 = this;
        } else {
            sharePanelImHeadViewModel2 = null;
        }
        if (sharePanelImHeadViewModel2 != null) {
            Bundle bundle = this.LL.extras;
            String string = bundle.getString("aid");
            if (string == null) {
                return false;
            }
            Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LL);
            String str = "";
            String string2 = bundle.getString("enter_from", "");
            String string3 = bundle.getString("author_id", "");
            String strValueOf = String.valueOf(bundle.getInt("follow_status", -1));
            String string4 = bundle.getString("panel_source", "");
            String strValueOf2 = String.valueOf(bundle.getInt("aweme_type", -1));
            boolean z2 = bundle.getBoolean("is_text_mode", false);
            if (awemeLJJIJIL != null) {
                recReasonTag = awemeLJJIJIL.getRecReasonTag();
                recReasonsStruct = awemeLJJIJIL.getRecReasonsStruct();
            } else {
                recReasonTag = null;
                recReasonsStruct = null;
            }
            String string5 = bundle.getString("from_page", "");
            String string6 = bundle.getString("tab_name", "");
            IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            if (iPoiService != null) {
                strLLIFFJFJJ = iPoiService.LLIFFJFJJ(awemeLJJIJIL);
            } else {
                strLLIFFJFJJ = null;
            }
            if (awemeLJJIJIL != null && (requestId = awemeLJJIJIL.getRequestId()) != null) {
                str = requestId;
            }
            UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(string2, null, string, string3, strValueOf, null, string4, false, null, strValueOf2, z2, recReasonTag, recReasonsStruct, string5, strLLIFFJFJJ, 0.0d, false, null, null, null, 0, null, null, string6, false, null, null, null, null, null, str, null, null, 0, null, null, null, -1076949534, 65023);
            if (C123100dR.LIZ(bundle.getString("search_type"))) {
                upvotePublishMobParam.searchId = bundle.getString("search_id", null);
                upvotePublishMobParam.searchResultId = bundle.getString("search_result_id", null);
                upvotePublishMobParam.searchKeyword = bundle.getString("search_keyword", null);
                upvotePublishMobParam.searchType = bundle.getString("search_type", null);
            }
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LIZJ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(string);
            if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
                Iterator<UpvoteStruct> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    UpvoteStruct next = it2.next();
                    User user = next.user;
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    if (Intrinsics.LJFF(uid, curUserId)) {
                        if (next != null) {
                            upvotePublishMobParam.enterMethod = "button";
                            C1360460lVU.LIZIZ.LJ(string, upvotePublishMobParam, false, new AwS565S0100000_21(this, 1670), null, null, null, null, false);
                            return false;
                        }
                    }
                }
            }
            UpvotePublishExtraData upvotePublishExtraData = new UpvotePublishExtraData(awemeLJJIJIL, bundle.getInt("page_type", -1));
            upvotePublishMobParam.enterMethod = "share_panel";
            C1360460lVU.LIZIZ.LJJJ(null, null, null, upvotePublishExtraData, upvotePublishMobParam, 0, string, null, null, null, null, new AwS565S0100000_21(this, 1671), new AwS104S1200000_21(upvotePublishExtraData, upvotePublishMobParam, string, 14), true);
            return false;
        }
        if ((iMContact instanceof C1363200lZu) && this != null) {
            this.LLILZIL.setValue(Boolean.TRUE);
            return false;
        }
        if ((iMContact instanceof C1363310la5) && this != null) {
            te0();
            return false;
        }
        if ((iMContact instanceof C1363170lZr) && this != null) {
            te0();
            return false;
        }
        if (iMContact instanceof C1363280la2) {
            sharePanelImHeadViewModel3 = this;
        } else {
            sharePanelImHeadViewModel3 = null;
        }
        if (sharePanelImHeadViewModel3 != null) {
            Aweme awemeLJJIJIL2 = C621180OYa.LIZ.LJJIJIL(this.LL);
            if (awemeLJJIJIL2 != null) {
                C1362630lYz.LIZ.getClass();
                C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
                if (c2096308Jd != null) {
                    c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.CLICK_INVITE_FRIEND.getValue()));
                }
                this.LLILLL.LJIILIIL();
                List<InterfaceC1369790lkX> list2 = this.LLILLJJLI;
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("enter_from", this.LLJJIJIL.LJIIL(), bundle2);
                C786410Ut5.LJJIZ(bundle2, "share_aweme", awemeLJJIJIL2);
                C786410Ut5.LJJIJL(bundle2, "aweme_share_pck", this.LL);
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1369790lkX interfaceC1369790lkX : list2) {
                    if (interfaceC1369790lkX.LJJIII()) {
                        arrayList.add(interfaceC1369790lkX);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((InterfaceC1369790lkX) it3.next()).key());
                }
                C786410Ut5.LJJJIL(bundle2, "prev_share_channel_key", new ArrayList(arrayList2));
                bundle2.putInt("SHARE_INVITE_FRIENDS_PANEL_STYLE", 1);
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
                    C1234690iEd.LIZIZ.LIZLLL(activityLIZIZ, bundle2).LJJ(this.LL.extras.getBoolean("key_invite_friends_sheet_has_overly", false));
                    return false;
                }
                return false;
            }
            return false;
        }
        if (!vQ2(iMContact, z, null)) {
            return false;
        }
        yQ2(iMContact, z);
        this.LLJI.setValue(this.LLJJIJIL.LJIILL());
        this.LLJILJILJ.setValue(new Pair<>(iMContact, Boolean.valueOf(z)));
        if (this.LLJJIJIL.LJII() && !((Boolean) C1382810m5X.LIZIZ.getValue()).booleanValue()) {
            this.LLILZLL.setValue(Boolean.TRUE);
        }
        zQ2();
        AQ2();
        return true;
    }

    public final void yQ2(IMContact iMContact, boolean z) {
        String string;
        Long lLJIILIIL;
        String string2;
        Bundle bundle;
        Bundle bundle2;
        if (z) {
            this.LL.extras.putInt("rank_num", this.LLJJIJIL.LJIIJJI().indexOf(iMContact));
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                Bundle bundle3 = this.LL.extras;
                String lastGroupId = C0SUC.LIZ(activityLJFF).getLastGroupId();
                if (lastGroupId == null) {
                    lastGroupId = "";
                }
                C786410Ut5.LJJJI("last_group_id", lastGroupId, bundle3);
            }
            boolean z2 = iMContact instanceof IMUser;
            if (z2) {
                Bundle bundle4 = this.LL.extras;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((IMUser) iMContact).getFollowStatus());
                sbLIZ.append("");
                C786410Ut5.LJJJI("relation_tag", C2188811AlT.LIZIZ(sbLIZ), bundle4);
            }
            String string3 = null;
            if (iMContact instanceof C1363710laj) {
                SharePackage sharePackage = this.LL;
                if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
                    string2 = bundle2.getString("aid");
                } else {
                    string2 = null;
                }
                SharePackage sharePackage2 = this.LL;
                if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                    string3 = bundle.getString("event_type");
                }
                C1364620lcC.LJIJJLI(C1364620lcC.LIZ, string3, string2, "share_panel");
            } else {
                C1367430lgj c1367430lgj = C1367430lgj.LIZ;
                SharePackage sharePackage3 = this.LL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0I0B c0i0b = C0I0B.LJFF;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
                InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
                c1367430lgj.getClass();
                C1367430lgj.LIZLLL(sharePackage3, iMContact, false, "", jCurrentTimeMillis, interfaceC1493505szLIZIZ, interfaceC1493505szLIZIZ2);
            }
            this.LL.extras.remove("rank_num");
            this.LLJJIJIL.LJIILL().add(iMContact);
            this.LLILLL.LJIIJ(this.LL, "chat_mergeIM");
            if (Intrinsics.LJFF(this.LL.itemType, "aigc_avatar")) {
                C1364620lcC.LJFF(C1364620lcC.LIZ, iMContact);
            }
            if ((Intrinsics.LJFF(this.LL.itemType, "aweme") || Intrinsics.LJFF(this.LL.itemType, "aweme_photo") || Intrinsics.LJFF(this.LL.itemType, "story_highlight")) && (string = this.LL.extras.getString("aid")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
                lLJIILIIL.longValue();
                if (z2) {
                    C1336205Ku.LIZ(false).getImChatService().LJJIIZ(iMContact.getUid());
                    return;
                } else {
                    if (!(iMContact instanceof IMConversation)) {
                        return;
                    }
                    ((IMConversation) iMContact).getConversationId();
                    return;
                }
            }
            return;
        }
        this.LLJJIJIL.LJIILL().remove(iMContact);
        C1367430lgj.LJIIIZ(C1367430lgj.LIZ, this.LL, iMContact, false);
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return vQ2(iMContact, z, fragment);
    }

    public final boolean vQ2(IMContact iMContact, boolean z, Fragment fragment) {
        if (z && this.LLJJIJIL.LJIIIIZZ() && !this.LLJJIJIL.LJIILL().contains(iMContact)) {
            return false;
        }
        if (!z || this.LLJJIJIL.LJIILL().size() < wQ2() || this.LLJJIJIL.LJIILL().contains(iMContact)) {
            return true;
        }
        this.LLJIJIL.setValue(Boolean.TRUE);
        if (fragment != null) {
            String quantityString = fragment.getResources().getQuantityString(2131755276, wQ2(), Integer.valueOf(wQ2()));
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(quantityString);
            c1389890mGx.LJIIJJI();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharePanelImHeadViewModel(SharePackage sharePackage, List<? extends InterfaceC1369790lkX> list, InterfaceC1362600lYw interfaceC1362600lYw, SharePanelViewModel sharePanelViewModel) {
        SharePanelViewModel sharePanelViewModelLIZ = sharePanelViewModel;
        this.LL = sharePackage;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC1362600lYw;
        Boolean bool = Boolean.FALSE;
        this.LLILZ = new MutableLiveData<>(bool);
        this.LLILZIL = new MutableLiveData<>(bool);
        this.LLILZLL = new MutableLiveData<>(bool);
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>(bool);
        this.LLJILJIL = new MutableLiveData<>(bool);
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>(bool);
        this.LLJJI = new MutableLiveData<>(bool);
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = C2296808zG.LIZ(new C1402360mb4(CoroutineExceptionHandler.LJJLIL, 0));
        sharePanelViewModelLIZ = sharePanelViewModelLIZ == null ? C1363350la9.LIZ(sharePackage, this, C13BV.INSTANCE, false, false, false, null, null, null, false, false, null, null, null, 16376) : sharePanelViewModelLIZ;
        this.LLJJIJIL = sharePanelViewModelLIZ;
        this.LLJJJ = "";
        sharePanelViewModelLIZ.LLJJJJLIIL = interfaceC1362600lYw;
    }
}
