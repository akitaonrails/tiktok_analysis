package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass0956;
import X.C03DZ;
import X.C057W;
import X.C05FG;
import X.C0PEM;
import X.C0XIR;
import X.C0YNP;
import X.C12WG;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1408930mlf;
import X.C1440805kU;
import X.C1440905kV;
import X.C1441830ncj;
import X.C1447800nmM;
import X.C15438062q;
import X.C15QI;
import X.C15QK;
import X.C1637106b3;
import X.C1697810uHb;
import X.C16C0;
import X.C16C4;
import X.C16CD;
import X.C16CE;
import X.C1748440vbG;
import X.C19A3;
import X.C19EG;
import X.C1DFH;
import X.C20511415Nw;
import X.C20577315fX;
import X.C20611215l0;
import X.C20612915lH;
import X.C20615115ld;
import X.C20615415lg;
import X.C20734616Bs;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2296808zG;
import X.C23250099c;
import X.C298900Bnc;
import X.C317160Cby;
import X.C438001n8;
import X.C438600HHu;
import X.C5183020f;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1439580nZ6;
import X.EnumC20615215le;
import X.EnumC539160LCo;
import X.ViewOnClickListenerC20572415ek;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.IEcPermissionAbility;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IEditShareSendToPanelUtils;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionRecommendListAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import com.ss.android.ugc.aweme.story.userpanel.ui.dm.DmListCell;
import com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListContentAssem;
import com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS49S2100000_31;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AkS97S0100000_31 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS97S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS97S0100000_31 akS97S0100000_31, View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ((VideoCaptionMentionRecommendListAssem) akS97S0100000_31.l0);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(C20612915lH.LIZIZ.LJIIIIZZ().LIZLLL());
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZ$1(AkS97S0100000_31 akS97S0100000_31, View view) {
        boolean z = !((C15QK) akS97S0100000_31.l0).LLLLILI().isChecked();
        ((C15QK) akS97S0100000_31.l0).LLLLILI().setChecked(z);
        ((C15QK) akS97S0100000_31.l0).LLLLIILL(z);
    }

    public static final void LIZ$10(AkS97S0100000_31 akS97S0100000_31, View view) {
        TikTokMediaModel tikTokMediaModel;
        C16C4 c16c4;
        C16CD c16cd;
        List<TikTokMediaModel> list = ((C20734616Bs) akS97S0100000_31.l0).LLJJJJLIIL;
        if (list != null && (tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(0, list)) != null && (c16c4 = ((C20734616Bs) akS97S0100000_31.l0).LLJJJIL) != null && (c16cd = c16c4.LLJJ) != null) {
            c16cd.LLLI(tikTokMediaModel, -1, false);
        }
    }

    public static final void LIZ$11(AkS97S0100000_31 akS97S0100000_31, View view) {
        LinearLayout linearLayout = ((C20734616Bs) akS97S0100000_31.l0).LLJLLIL;
        if (linearLayout != null) {
            C03DZ.LIZ(linearLayout);
        }
        C16C0.LIZ = true;
    }

    public static final void LIZ$12(AkS97S0100000_31 akS97S0100000_31, View view) {
        IEcPermissionAbility iEcPermissionAbility = ((C20734616Bs) akS97S0100000_31.l0).LLL;
        if (iEcPermissionAbility != null) {
            iEcPermissionAbility.Pr();
        }
    }

    public static final void LIZ$13(AkS97S0100000_31 akS97S0100000_31, View view) {
        ((C20734616Bs) akS97S0100000_31.l0).LLLLIL();
    }

    public static final void LIZ$14(AkS97S0100000_31 akS97S0100000_31, View view) {
        ViewOnClickListenerC20572415ek viewOnClickListenerC20572415ek = (ViewOnClickListenerC20572415ek) akS97S0100000_31.l0;
        viewOnClickListenerC20572415ek.onClick(viewOnClickListenerC20572415ek.LLIZLLLIL);
    }

    public static final void LIZ$15(AkS97S0100000_31 akS97S0100000_31, View view) {
        FrameLayout frameLayout = ((C16CE) akS97S0100000_31.l0).LLILLL;
        if (frameLayout != null) {
            frameLayout.performClick();
        }
    }

    public static final void LIZ$16(AkS97S0100000_31 akS97S0100000_31, View view) {
        ((C20577315fX) akS97S0100000_31.l0).LLLIL();
    }

    public static final void LIZ$17(AkS97S0100000_31 akS97S0100000_31, View view) {
        ((C20577315fX) akS97S0100000_31.l0).LLLIL();
    }

    public static final void LIZ$18(AkS97S0100000_31 akS97S0100000_31, View view) {
        ((C20577315fX) akS97S0100000_31.l0).LLLIL();
    }

    public static final void LIZ$2(AkS97S0100000_31 akS97S0100000_31, View view) {
        C15QK c15qk = (C15QK) akS97S0100000_31.l0;
        C1441830ncj c1441830ncj = null;
        if (c15qk.LLJJJJ) {
            C1441830ncj c1441830ncj2 = c15qk.LLJJIJIIJIL;
            if (c1441830ncj2 != null) {
                c1441830ncj = c1441830ncj2;
            }
            c1441830ncj.LIZLLL();
            C15QK c15qk2 = (C15QK) akS97S0100000_31.l0;
            c15qk2.LLJJJJ = false;
            C786410Ut5.LLLLLLZZ(c15qk2.LLLLJ(), 0);
            return;
        }
        C1441830ncj c1441830ncj3 = c15qk.LLJJIJIIJIL;
        if (c1441830ncj3 != null) {
            c1441830ncj = c1441830ncj3;
        }
        c1441830ncj.LJ();
        C15QK c15qk3 = (C15QK) akS97S0100000_31.l0;
        c15qk3.LLJJJJ = true;
        C786410Ut5.LLLLLLZZ(c15qk3.LLLLJ(), 4);
    }

    public static final void LIZ$3(AkS97S0100000_31 akS97S0100000_31, View view) {
        C15QI c15qi;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i = 0;
        for (PUgcSlotData pUgcSlotData : ((C15QK) akS97S0100000_31.l0).LLJJIJIL) {
            int i2 = i + 1;
            if (i >= 0) {
                PUgcSlotData pUgcSlotData2 = pUgcSlotData;
                if (pUgcSlotData2.isFixed) {
                    arrayList.add(pUgcSlotData2.uuid);
                    arrayList2.add(Integer.valueOf(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C15QI c15qi2 = ((C15QK) akS97S0100000_31.l0).LLJJJ;
        if (c15qi2 != null) {
            c15qi2.LIZJ(arrayList, arrayList2);
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ((C15QK) akS97S0100000_31.l0);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.remove((C15QK) akS97S0100000_31.l0);
        }
        if (!C12WG.LIZIZ((C15QK) akS97S0100000_31.l0) && (c15qi = ((C15QK) akS97S0100000_31.l0).LLJJJ) != null) {
            c15qi.goBack();
        }
    }

    public static final void LIZ$4(AkS97S0100000_31 akS97S0100000_31, View view) {
        String string;
        Editable text;
        if (C298900Bnc.LIZ()) {
            C1748440vbG c1748440vbG = ((C15QK) akS97S0100000_31.l0).LLLILZLLLI;
            if (c1748440vbG == null || (text = c1748440vbG.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            int iLLLLLILLIL = ((C15QK) akS97S0100000_31.l0).LLLLLILLIL(string);
            if (iLLLLLILLIL < 0) {
                if (iLLLLLILLIL != -2) {
                    if (iLLLLLILLIL == -1) {
                        C15QK c15qk = (C15QK) akS97S0100000_31.l0;
                        c15qk.bu(c15qk.getString(2131850019));
                        return;
                    }
                    return;
                }
                C15QK c15qk2 = (C15QK) akS97S0100000_31.l0;
                c15qk2.bu(c15qk2.getString(2131850020));
                return;
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int i = 0;
        for (PUgcSlotData pUgcSlotData : ((C15QK) akS97S0100000_31.l0).LLJJIJIL) {
            int i2 = i + 1;
            if (i >= 0) {
                PUgcSlotData pUgcSlotData2 = pUgcSlotData;
                if (pUgcSlotData2.isFixed) {
                    arrayList.add(pUgcSlotData2.uuid);
                    arrayList2.add(Integer.valueOf(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (((C15QK) akS97S0100000_31.l0).LLJJIJIL.size() > 0 && arrayList.size() == ((C15QK) akS97S0100000_31.l0).LLJJIJIL.size()) {
            C15QK c15qk3 = (C15QK) akS97S0100000_31.l0;
            c15qk3.bu(c15qk3.getString(2131850071));
            return;
        }
        C15QI c15qi = ((C15QK) akS97S0100000_31.l0).LLJJJ;
        if (c15qi != null) {
            c15qi.LIZLLL(arrayList, arrayList2);
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ((C15QK) akS97S0100000_31.l0);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.remove((C15QK) akS97S0100000_31.l0);
        }
        C15QK c15qk4 = (C15QK) akS97S0100000_31.l0;
        C19A3 c19a3 = c15qk4.LLJJIJI;
        if (c19a3 == null) {
            return;
        }
        c19a3.hide(c15qk4);
    }

    public static final void LIZ$5(AkS97S0100000_31 akS97S0100000_31, View view) {
        DmViewModel dmViewModel;
        C20615115ld c20615115ld;
        C317160Cby item = ((DmListCell) akS97S0100000_31.l0).getItem();
        if (item != null && (dmViewModel = (DmViewModel) ((DmListCell) akS97S0100000_31.l0).LLILZIL.getValue()) != null) {
            User user = item.LL;
            String strVQ2 = dmViewModel.vQ2(user);
            if (dmViewModel.LLILZIL == null) {
                dmViewModel.LLILZIL = new C20615415lg(ViewModelKt.getViewModelScope(dmViewModel), dmViewModel.LLILZLL, dmViewModel.LLIZ, new AwS653S0100000_4(dmViewModel, 24));
            }
            C20615415lg c20615415lg = dmViewModel.LLILZIL;
            if (c20615415lg != null) {
                String uid = user.getUid();
                String nickname = user.getNickname();
                if (strVQ2.length() != 0) {
                    synchronized (c20615415lg.LJ) {
                        try {
                            LinkedHashMap linkedHashMap = (LinkedHashMap) c20615415lg.LIZLLL;
                            Object c20615115ld2 = linkedHashMap.get(strVQ2);
                            if (c20615115ld2 == null) {
                                c20615115ld2 = new C20615115ld(c20615415lg.LIZ, strVQ2, new AwS49S2100000_31(c20615415lg, uid, nickname, 2), c20615415lg.LIZIZ);
                                linkedHashMap.put(strVQ2, c20615115ld2);
                            }
                            c20615115ld = (C20615115ld) c20615115ld2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (c20615115ld.LJ == EnumC20615215le.NOT_SENT) {
                        AnonymousClass0956 anonymousClass0956 = c20615115ld.LJFF;
                        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                            AnonymousClass0956 anonymousClass09562 = c20615115ld.LJFF;
                            if (anonymousClass09562 != null) {
                                anonymousClass09562.LIZIZ(null);
                            }
                            c20615115ld.LJFF = null;
                        }
                        if (c20615115ld.LIZLLL) {
                            c20615115ld.LJFF = C23250099c.LIZLLL(c20615115ld.LIZ, C0PEM.LIZ, null, new C1440905kV(c20615115ld, null), 2);
                        } else {
                            EnumC20615215le enumC20615215le = EnumC20615215le.SENDING;
                            c20615115ld.LJ = enumC20615215le;
                            c20615115ld.LIZJ.invoke(enumC20615215le);
                            c20615115ld.LJFF = C23250099c.LIZLLL(c20615115ld.LIZ, C0PEM.LIZ, null, new C1440805kU(c20615115ld, null), 2);
                        }
                    }
                }
            }
            dmViewModel.LLILZ.setValue(Boolean.TRUE);
        }
        DmListCell dmListCell = (DmListCell) akS97S0100000_31.l0;
        if (Intrinsics.LJFF(dmListCell.I5().LLILZLL, "dm_primary")) {
            C1408930mlf c1408930mlf = C1408930mlf.LIZ;
            VideoPublishEditModel videoPublishEditModel = dmListCell.I5().LLJ;
            String str = dmListCell.I5().LLJI;
            c1408930mlf.getClass();
            C1408930mlf.LIZIZ(videoPublishEditModel, str, "story_edit_page_message_panel_dm_click");
            return;
        }
        if (!Intrinsics.LJFF(dmListCell.I5().LLILZLL, "dm_followup")) {
            return;
        }
        C1408930mlf c1408930mlf2 = C1408930mlf.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = dmListCell.I5().LLJ;
        c1408930mlf2.getClass();
        C1408930mlf.LIZIZ(videoPublishEditModel2, null, "story_edit_page_also_share_to_panel_dm_click");
    }

    public static final void LIZ$6(AkS97S0100000_31 akS97S0100000_31, View view) {
        DmViewModel dmViewModel;
        C20615115ld c20615115ld;
        C317160Cby item = ((DmListCell) akS97S0100000_31.l0).getItem();
        if (item != null && (dmViewModel = (DmViewModel) ((DmListCell) akS97S0100000_31.l0).LLILZIL.getValue()) != null) {
            String strVQ2 = dmViewModel.vQ2(item.LL);
            if (dmViewModel.LLILZIL == null) {
                dmViewModel.LLILZIL = new C20615415lg(ViewModelKt.getViewModelScope(dmViewModel), dmViewModel.LLILZLL, dmViewModel.LLIZ, new AwS653S0100000_4(dmViewModel, 24));
            }
            C20615415lg c20615415lg = dmViewModel.LLILZIL;
            if (c20615415lg != null && (c20615115ld = (C20615115ld) ((LinkedHashMap) c20615415lg.LIZLLL).get(strVQ2)) != null) {
                if (c20615115ld.LJ != EnumC20615215le.SENDING) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Attempted to undo a message in an invalid state. State: ");
                    sbLIZ.append(c20615115ld.LJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Undoing message sending at conversation ID: ");
                    sbLIZ2.append(c20615115ld.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    EnumC20615215le enumC20615215le = EnumC20615215le.NOT_SENT;
                    c20615115ld.LJ = enumC20615215le;
                    c20615115ld.LIZJ.invoke(enumC20615215le);
                    AnonymousClass0956 anonymousClass0956 = c20615115ld.LJFF;
                    if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                        AnonymousClass0956 anonymousClass09562 = c20615115ld.LJFF;
                        if (anonymousClass09562 != null) {
                            anonymousClass09562.LIZIZ(null);
                        }
                        c20615115ld.LJFF = null;
                    }
                }
            }
        }
        DmListCell dmListCell = (DmListCell) akS97S0100000_31.l0;
        if (Intrinsics.LJFF(dmListCell.I5().LLILZLL, "dm_primary")) {
            C1408930mlf c1408930mlf = C1408930mlf.LIZ;
            VideoPublishEditModel videoPublishEditModel = dmListCell.I5().LLJ;
            String str = dmListCell.I5().LLJI;
            c1408930mlf.getClass();
            C1408930mlf.LIZIZ(videoPublishEditModel, str, "story_edit_page_message_panel_dm_undo_click");
            return;
        }
        if (!Intrinsics.LJFF(dmListCell.I5().LLILZLL, "dm_followup")) {
            return;
        }
        C1408930mlf c1408930mlf2 = C1408930mlf.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = dmListCell.I5().LLJ;
        c1408930mlf2.getClass();
        C1408930mlf.LIZIZ(videoPublishEditModel2, null, "story_edit_page_also_share_to_panel_dm_undo_click");
    }

    public static final void LIZ$7(AkS97S0100000_31 akS97S0100000_31, View view) {
        C19EG c19eg;
        C317160Cby item;
        User user;
        Fragment fragmentLJI;
        DmListCell dmListCell = (DmListCell) akS97S0100000_31.l0;
        Activity activityLIZ = C1388190mED.LIZ(dmListCell.itemView.getContext());
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (item = dmListCell.getItem()) != null && (user = item.LL) != null) {
            String strLJ = C0YNP.LJ(user.getUid());
            if (strLJ.length() != 0) {
                IMUser.Companion.getClass();
                IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
                if (iMUserLIZJ != null) {
                    IEditShareSendToPanelUtils iEditShareSendToPanelUtils = (IEditShareSendToPanelUtils) PluggableExtentionKt.pluggableSpi$default(IEditShareSendToPanelUtils.class, false, false, false, 14, null);
                    if (iEditShareSendToPanelUtils != null) {
                        iEditShareSendToPanelUtils.LIZ(c19eg, strLJ, iMUserLIZJ, "story_edit_page_message_panel", dmListCell.I5().LLILLJJLI, false, EnumC539160LCo.VIDEO_EDIT_PAGE.getValue(), null);
                    }
                    LifecycleOwner parent = dmListCell.getParent();
                    if (parent != null && (fragmentLJI = C724240Sb0.LJI(parent)) != null) {
                        C438600HHu.LIZ(fragmentLJI);
                    }
                }
            }
        }
    }

    public static final void LIZ$8(AkS97S0100000_31 akS97S0100000_31, View view) {
        boolean z;
        MentionAfterPublishListContentAssem mentionAfterPublishListContentAssem = (MentionAfterPublishListContentAssem) akS97S0100000_31.l0;
        mentionAfterPublishListContentAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(mentionAfterPublishListContentAssem);
        if (!C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new C5183020f(fragmentLJI, 284))) {
            List<User> list = mentionAfterPublishListContentAssem.Lo().getState().LLILLL.LIZ.LIZ;
            String str = mentionAfterPublishListContentAssem.ip().LL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<User> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getUid());
            }
            try {
                mentionAfterPublishListContentAssem.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C057W(new C05FG(str, arrayList, mentionAfterPublishListContentAssem.ip().LLJILJILJ.getValue()), null), 3);
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1637106b3(list, fragmentLJI, null), 3);
                C20611215l0.LIZ(mentionAfterPublishListContentAssem.ip().LLILLL, mentionAfterPublishListContentAssem.ip().LLILLJJLI, mentionAfterPublishListContentAssem.ip().LL, list);
            } catch (C0XIR e) {
                TryCatchGuardChecker.doCheck(e);
            }
            IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
            if (iStoryMentionShareService != null) {
                if (mentionAfterPublishListContentAssem.ip().LLJILJILJ == EnumC1439580nZ6.ENABLE) {
                    z = true;
                } else {
                    z = false;
                }
                iStoryMentionShareService.LJIIJ(z);
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(mentionAfterPublishListContentAssem);
            if (fragmentLJI2 != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C438001n8(fragmentLJI2, null), 3);
            }
        }
    }

    public static final void LIZ$9(AkS97S0100000_31 akS97S0100000_31, View view) {
        C20511415Nw c20511415Nw = (C20511415Nw) akS97S0100000_31.l0;
        c20511415Nw.LLJ.LIZ(c20511415Nw.LL, c20511415Nw.LLILLJJLI, c20511415Nw.LLILZ);
    }
}
