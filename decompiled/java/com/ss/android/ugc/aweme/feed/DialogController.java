package com.ss.android.ugc.aweme.feed;

import X.AbstractC848400XPy;
import X.AnonymousClass0716;
import X.C0BFU;
import X.C0HIN;
import X.C0HTT;
import X.C0OAD;
import X.C0SUC;
import X.C0T4J;
import X.C0XQ7;
import X.C1355680lNm;
import X.C1390920mIc;
import X.C1618440sDa;
import X.C19211310Dv;
import X.C19EG;
import X.C19EH;
import X.C2093608Ic;
import X.C2187451AjH;
import X.C313130CPf;
import X.C523420Kfs;
import X.C621180OYa;
import X.C723150SYf;
import X.C729510SjV;
import X.C735280Sso;
import X.C735370Ssx;
import X.C737030Svd;
import X.C739210Sz9;
import X.C786410Ut5;
import X.C818480W8w;
import X.InterfaceC1238780iLE;
import X.InterfaceC1369790lkX;
import X.InterfaceC739290SzH;
import X.InterfaceC739430SzV;
import X.InterfaceC739680Szu;
import X.InterfaceC752010Teh;
import Y.AObjectS355S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.favorites.ui.UnFavouritesFragment;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.service.ISocPublishService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class DialogController extends BaseDialogController implements InterfaceC739290SzH, InterfaceC739430SzV, InterfaceC739680Szu {
    public final C0HTT<C737030Svd> LLILLJJLI;
    public final InterfaceC752010Teh LLILLL;
    public C723150SYf LLILZ;
    public WeakReference<TuxSheet> LLILZIL;
    public InterfaceC1238780iLE LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final Context getContext() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.BaseDialogController
    public final void LLFII() {
        C723150SYf c723150SYf = new C723150SYf(this.activity);
        this.LLILZ = c723150SYf;
        c723150SYf.LJIIJ(new C19211310Dv(C0BFU.LIZ));
        try {
            FragmentManager fragmentManagerLJZI = LJZI();
            Fragment fragmentLJJJJZI = fragmentManagerLJZI.LJJJJZI("comment");
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJZI.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final void onDetach() {
        super.onDetach();
        C723150SYf c723150SYf = this.LLILZ;
        if (c723150SYf != null) {
            c723150SYf.LJIILJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController, com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final Activity getActivity() {
        return this.activity;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController, com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String getFrom() {
        return this.mFrom;
    }

    public static boolean LLIIL(Aweme aweme) {
        boolean z;
        List<CameoInfo> cameoInfo;
        C735280Sso.LIZ.getClass();
        boolean zLJFF = C735280Sso.LJFF(aweme);
        if (aweme.getAuthor() != null && C2093608Ic.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (!zLJFF) {
            return false;
        }
        AITheaterInfo aITheaterInfo = aweme.aiTheaterInfo;
        if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null) {
            for (CameoInfo cameoInfo2 : cameoInfo) {
                if (cameoInfo2 != null && cameoInfo2.getUserBaseInfo() != null && C2093608Ic.LIZJ(cameoInfo2.getUserBaseInfo().getUserId(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    return true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final String C7(boolean z) {
        int i = this.mPageType;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1000) {
                        if (i != 1001) {
                            if (i != 2000) {
                                if (i != 2001) {
                                    if (i != 3002) {
                                        if (i != 3003) {
                                            if (i != 4000) {
                                                if (i != 4001) {
                                                    if (TextUtils.equals(this.mEventType, "upload")) {
                                                        return "release";
                                                    }
                                                    return this.mEventType;
                                                }
                                                return "single_Msong_fresh";
                                            }
                                            return "single_song";
                                        }
                                        return "challenge_fresh";
                                    }
                                    return "challenge";
                                }
                                return "others_collection";
                            }
                            return "others_homepage";
                        }
                        return "personal_collection";
                    }
                    return "personal_homepage";
                }
                return "homepage_fresh";
            }
            return "homepage_follow";
        }
        return "homepage_hot";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    @Override // X.InterfaceC739290SzH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.C739080Syw r13) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.DialogController.LJJI(X.0Syw):void");
    }

    @Override // X.InterfaceC739290SzH
    public final void LJJJLIIL(Aweme aweme) {
        if (this.LLILLL == null) {
            return;
        }
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LJJLIIIIJ(this.activity, this.fragment, aweme, 300000, this.LLILLL.C7(true), getEventType(), false, true);
    }

    @Override // X.InterfaceC739290SzH
    public final void LJJLIIIJ(Aweme aweme) {
        if (this.LLILLL == null) {
            return;
        }
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LJJLIIIIJ(this.activity, this.fragment, aweme, 300000, this.LLILLL.C7(true), getEventType(), false, false);
        C523420Kfs.LIZ().LJJIJIL(this.activity, this.fragment, aweme, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.BaseController
    public final void LLD(String str) {
        this.mFrom = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.BaseDialogController
    public final void LLFZ(String str) {
        this.LLJIJIL = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.BaseDialogController
    public final void LLIIII(String str) {
        this.LLJ = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJI = str;
    }

    public final void LLIIIILZ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        TuxSheet tuxSheet = this.LLILZIL.get();
        TuxSheet tuxSheet2 = this.LLILZIL.get();
        if (tuxSheet2 != null && tuxSheet2.getDialog() != null && tuxSheet2.getDialog().isShowing()) {
            if (tuxSheet != null && tuxSheet.getDialog() != null) {
                C786410Ut5.LIZIZ(tuxSheet.getDialog());
            } else {
                C786410Ut5.LIZIZ(null);
                throw null;
            }
        }
    }

    public final JSONObject LLIIIZ(Aweme aweme) {
        boolean z;
        JSONObject jSONObjectLIZJ = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZJ(this.mPageType, aweme);
        String str = this.mEnterMethodValue;
        if (str == null) {
            str = "click";
        }
        if (jSONObjectLIZJ == null) {
            jSONObjectLIZJ = new JSONObject();
        }
        try {
            jSONObjectLIZJ.put("enter_from", this.mEventType);
            if ("like_banner".equals(str)) {
                jSONObjectLIZJ.put("previous_page", str);
            } else {
                jSONObjectLIZJ.put("enter_method", str);
            }
            if (aweme == null || aweme.getAwemeType() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObjectLIZJ.put("is_photo", 0);
            } else {
                jSONObjectLIZJ.put("is_photo", 1);
            }
            jSONObjectLIZJ.put("author_id", AwemeExtKt.getAuthorUid(aweme));
            return jSONObjectLIZJ;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObjectLIZJ;
        }
    }

    @Override // X.InterfaceC739680Szu
    public final void LJJJJJ(Aweme aweme, int[] iArr) {
        ((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIILIIL(this.activity, aweme, C7(true), iArr);
    }

    @Override // X.InterfaceC739290SzH
    public final void LJLJJLL(Aweme aweme, int[] iArr) {
        if (iArr == null) {
            return;
        }
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LLIIIZ(this.activity, this.fragment, aweme, C7(true), iArr);
    }

    public final void LLIILZL(Aweme aweme, C0T4J c0t4j) {
        TuxSheet tuxSheet = this.LLILZIL.get();
        if (tuxSheet != null && tuxSheet.getDialog() != null) {
            return;
        }
        C735280Sso.LIZ.getClass();
        if (!C735280Sso.LJFF(aweme)) {
            if ((C735370Ssx.LJJIJLIJ(aweme) && AwemeExtKt.isProhibited(aweme)) || C0OAD.LIZJ(aweme) || c0t4j == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putIntArray("share_button_location", c0t4j.LJIJJ);
            C786410Ut5.LJJJI("panel_source", c0t4j.LJIIJJI, bundle);
            C786410Ut5.LJJJI("enter_method", c0t4j.LJIIIIZZ, bundle);
            C786410Ut5.LJJJI("event_type", this.LLILLL.C7(true), bundle);
            bundle.putBoolean("icon_highlight_status", c0t4j.LJIJJLI);
            C786410Ut5.LJJJI("tab_name", c0t4j.LIZ, bundle);
            Integer num = c0t4j.LJJIJIIJI;
            if (num != null) {
                bundle.putInt("is_enter_graphic_detail", num.intValue());
            }
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            C621180OYa.LIZ.LJIL(activity, this.fragment, aweme, LLIIL(aweme), this.LLILLJJLI, bundle);
        }
    }

    public final void LLIIIJ(Aweme aweme, C0T4J c0t4j, InterfaceC1369790lkX interfaceC1369790lkX) {
        if (c0t4j == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("panel_source", c0t4j.LJIIJJI, bundle);
        C1355680lNm.LIZIZ(bundle, c0t4j.LJIIJJI);
        C786410Ut5.LJJJI("enter_method", c0t4j.LJIIIIZZ, bundle);
        C786410Ut5.LJJJI("event_type", this.LLILLL.C7(true), bundle);
        Integer num = c0t4j.LJJIJIIJI;
        if (num != null) {
            bundle.putInt("is_enter_graphic_detail", num.intValue());
        }
        Activity activity = this.activity;
        if (activity == null) {
            return;
        }
        C621180OYa.LIZ.LIZIZ(activity, this.fragment, aweme, LLIIL(aweme), this.LLILLJJLI, bundle, interfaceC1369790lkX);
    }

    public final void LLIIZ(Activity activity, final Aweme aweme, C0T4J c0t4j) {
        Activity activity2;
        int i;
        String uniqueId;
        if (activity != null) {
            activity2 = activity;
        } else {
            activity2 = this.activity;
            if (activity2 == null) {
                return;
            }
        }
        if (!activity2.isFinishing()) {
            if (aweme.getVideo() == null && !C729510SjV.LJIJ(aweme) && aweme.getAwemeType() != 504) {
                return;
            }
            if (TextUtils.equals(this.mEventType, "collection_video") && AwemeExtKt.isCollected(aweme) && (!aweme.isCanPlay() || C0OAD.LIZIZ(aweme))) {
                Activity activity3 = this.activity;
                if (activity3 != null && !activity3.isFinishing() && (activity3 instanceof C19EG)) {
                    final String str = c0t4j.LJIIIIZZ;
                    final C19EG c19eg = (C19EG) activity3;
                    String str2 = this.mEventType;
                    UnFavouritesFragment unFavouritesFragment = new UnFavouritesFragment();
                    unFavouritesFragment.LL = str2;
                    unFavouritesFragment.LLILLJJLI = aweme;
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = unFavouritesFragment;
                    tuxSheet.LLJJIJIIJIL = false;
                    c1390920mIc.LJIIIIZZ(1);
                    DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0HJ5
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i2;
                            ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIJ(aweme);
                            if (Intrinsics.LJFF(str, "long_press") && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
                                C19EG c19eg2 = c19eg;
                                if (c19eg2 instanceof InterfaceC1603190roz) {
                                    i2 = 1;
                                } else if (c19eg2 instanceof InterfaceC1058480deQ) {
                                    i2 = 2;
                                } else {
                                    i2 = -1;
                                }
                                C1440005kM.LIZ(new C1372310lob(i2, c19eg2.hashCode()));
                            }
                        }
                    };
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLILLJJLI = onDismissListener;
                    tuxSheet2.show(c19eg.getSupportFragmentManager(), "UnFavouritesFragment");
                }
            } else if ((!C735370Ssx.LJJIJLIJ(aweme) || !AwemeExtKt.isProhibited(aweme)) && !C0OAD.LIZJ(aweme)) {
                if (LLIIL(aweme)) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("play_list_type", this.LLIZ, bundle);
                    C786410Ut5.LJJJI("play_list_id_key", this.LLIZLLLIL, bundle);
                    C786410Ut5.LJJJI("play_list_id_value", this.LLJ, bundle);
                    C786410Ut5.LJJJI("play_list_id", this.LLJ, bundle);
                    C786410Ut5.LJJJI("play_list_type", this.LLIZ, bundle);
                    C786410Ut5.LJJJI("enter_method", c0t4j.LJIIIIZZ, bundle);
                    C786410Ut5.LJJJI("panel_source", c0t4j.LJIIJJI, bundle);
                    C786410Ut5.LJJJI("play_list_id_key", this.LLIZLLLIL, bundle);
                    C786410Ut5.LJJJI("tab_name", this.LLJI, bundle);
                    C786410Ut5.LJJJI("event_type", this.LLILLL.C7(true), bundle);
                    c0t4j.LIZ(bundle);
                    this.LLILZIL = new WeakReference<>(C621180OYa.LIZ.LJIIJJI(activity2, this.fragment, aweme, this.LLILLJJLI, bundle));
                } else if (C729510SjV.LJIJ(aweme) && C1618440sDa.LIZIZ.LJJJI(aweme) && C729510SjV.LJJ(aweme)) {
                    if (activity instanceof C19EG) {
                        C19EG c19eg2 = (C19EG) activity;
                        C0HTT<C737030Svd> c0htt = this.LLILLJJLI;
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("enter_from", this.mEventType, bundle2);
                        C786410Ut5.LJJJI("enter_position", c0t4j.LJIIL, bundle2);
                        ISocPublishService iSocPublishService = (ISocPublishService) PluggableExtentionKt.pluggableSpi(ISocPublishService.class);
                        if (iSocPublishService != null) {
                            iSocPublishService.LIZIZ(aweme, c19eg2, c0htt, bundle2).show(c19eg2.getSupportFragmentManager(), "story_cancel_upload_dialog");
                        }
                    }
                } else {
                    C818480W8w.LIZ("share_panel");
                    Bundle bundle3 = new Bundle();
                    C786410Ut5.LJJJI("enter_position", c0t4j.LJIIL, bundle3);
                    C786410Ut5.LJJJI("play_list_type", this.LLIZ, bundle3);
                    C786410Ut5.LJJJI("play_list_id_key", this.LLIZLLLIL, bundle3);
                    C786410Ut5.LJJJI("play_list_id_value", this.LLJ, bundle3);
                    C786410Ut5.LJJJI("play_list_id", this.LLJ, bundle3);
                    C786410Ut5.LJJJI("play_list_type", this.LLIZ, bundle3);
                    C786410Ut5.LJJJI("play_list_id_key", this.LLIZLLLIL, bundle3);
                    C786410Ut5.LJJJI("tab_name", this.LLJI, bundle3);
                    C786410Ut5.LJJJI("event_type", this.LLILLL.C7(true), bundle3);
                    C786410Ut5.LJJJI("enter_method", c0t4j.LJIIIIZZ, bundle3);
                    C786410Ut5.LJJJI("panel_source", c0t4j.LJIIJJI, bundle3);
                    C1355680lNm.LIZIZ(bundle3, c0t4j.LJIIJJI);
                    C735280Sso.LIZ.getClass();
                    if (C735280Sso.LJIIIIZZ(aweme)) {
                        i = 3;
                    } else if (C735280Sso.LIZJ(aweme)) {
                        i = 2;
                    } else if (C735280Sso.LJI(aweme) && aweme.getAuthor() != null && aweme.getAuthor().isAccuratePrivateAccount()) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    bundle3.putInt("share_im_limit_tip_type", i);
                    if (aweme.getAuthor() == null) {
                        uniqueId = "";
                    } else {
                        uniqueId = aweme.getAuthor().getUniqueId();
                    }
                    C786410Ut5.LJJJI("author_user_name", uniqueId, bundle3);
                    C786410Ut5.LJJJI("creation_id", this.LLJIJIL, bundle3);
                    C786410Ut5.LJJJI("previousPage", C0SUC.LIZ(this.activity).getPreviousPage(), bundle3);
                    C786410Ut5.LJJJI("previousPagePosition", C0SUC.LIZ(this.activity).getPreviousPagePosition(), bundle3);
                    C786410Ut5.LJJJI("category_name", C0SUC.LIZ(this.activity).getCategoryName(), bundle3);
                    C786410Ut5.LJJJI("video_from", this.mFrom, bundle3);
                    C786410Ut5.LJJJI("referral_enter_from", C0SUC.LIZ(this.activity).getReferralEnterFrom(), bundle3);
                    C786410Ut5.LJJJI("referral_page_enter_from", C0SUC.LIZ(this.activity).getReferralPageEnterFrom(), bundle3);
                    bundle3.putBoolean("is_referral", C0SUC.LIZ(this.activity).getFromReferral());
                    C786410Ut5.LJJJI("external_sharer_uid", c0t4j.LJIIIZ, bundle3);
                    C786410Ut5.LJJJI("_oid", c0t4j.LJIIJ, bundle3);
                    bundle3.putBoolean("use_common_share", true);
                    bundle3.putBoolean("is_friends_v3_repost", c0t4j.LJJIIJZLJL);
                    bundle3.putBoolean("is_friends_v3_text", c0t4j.LJJIIZ);
                    bundle3.putBoolean("has_overlay", c0t4j.LJJIIZI);
                    C786410Ut5.LJJJI("friends_v3_track_scene", c0t4j.LJJIJ, bundle3);
                    bundle3.putBoolean("is_tako_ai_video", c0t4j.LJIIZILJ);
                    c0t4j.LIZ(bundle3);
                    C621180OYa.LIZ.LIZLLL(activity2, this.fragment, aweme, LLIIL(aweme), this.LLILLJJLI, bundle3, new AObjectS355S0100000_12(this, 16));
                }
            } else if (activity2 instanceof C19EG) {
                C0HIN.LIZ((C19EG) activity2, aweme, this.LLILLJJLI, c0t4j, null);
            }
            C2187451AjH.LJJIJIIJIL(500L);
        }
    }

    public DialogController(String str, int i, C0HTT<C737030Svd> c0htt, InterfaceC752010Teh interfaceC752010Teh) {
        super(str, i);
        this.LLILZIL = new WeakReference<>(null);
        this.LLJIJIL = "";
        this.LLILLJJLI = c0htt;
        this.LLILLL = interfaceC752010Teh;
        if (!((Boolean) AnonymousClass0716.LJJIJIL.getValue()).booleanValue()) {
            C313130CPf.LIZIZ();
        }
    }

    @Override // X.InterfaceC739430SzV
    public final void LJL(Activity activity, Aweme aweme, C739210Sz9 c739210Sz9, String str, String str2) {
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIII(activity, aweme, c739210Sz9, str, str2);
    }

    @Override // X.InterfaceC739430SzV
    public final void LJLLLL(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIJJLI(activity, aweme, str, str2, str3, str4);
    }
}
