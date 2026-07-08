package irm;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C05HM;
import X.C0OJC;
import X.C0OOP;
import X.C0OTS;
import X.C0OWL;
import X.C0OYC;
import X.C0OYF;
import X.C0OYG;
import X.C0OYT;
import X.C0OYU;
import X.C0PEM;
import X.C0XQ7;
import X.C1182410gsJ;
import X.C118300cf;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C11JF;
import X.C1527905yX;
import X.C1558360qeg;
import X.C19719612Di;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C618910OPh;
import X.C619630OSb;
import X.C633020OsG;
import X.DialogC1389620mGW;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEditEventGamePlayAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenTopBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.preview.BulletinEditPreviewAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentMoreCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PreSaveInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicPresaveButtonAssem;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTagPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S0101000_4;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AkS81S0100000_9 extends AbstractViewOnClickListenerC1173120gdK {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS81S0100000_9(C619630OSb c619630OSb, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = c619630OSb;
    }

    public static final void LIZ$0(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((CreativeToolCommonBottomComponent) akS81S0100000_9.l0).bo(null);
    }

    public static final void LIZ$1(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((CreativeToolCommonBottomComponent) akS81S0100000_9.l0).bo(null);
    }

    public static final void LIZ$10(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((Function0) akS81S0100000_9.l0).invoke();
    }

    public static final void LIZ$11(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((BulletinFullScreenTopBarAssem) akS81S0100000_9.l0).lp();
    }

    public static final void LIZ$12(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((BulletinFullScreenTopBarAssem) akS81S0100000_9.l0).lp();
    }

    public static final void LIZ$13(AkS81S0100000_9 akS81S0100000_9, View view) {
        View view2;
        Context context;
        String str;
        String string;
        String str2;
        String string2;
        Long l;
        Long l2;
        String string3;
        C619630OSb c619630OSb = (C619630OSb) akS81S0100000_9.l0;
        BulletinCommonAbility bulletinCommonAbility = c619630OSb.LIZJ;
        if ((bulletinCommonAbility != null && !bulletinCommonAbility.eb2()) || (view2 = c619630OSb.LJFF) == null || (context = view2.getContext()) == null || (str = c619630OSb.LJIILJJIL) == null || str.length() == 0) {
            return;
        }
        C11JF c11jf = c619630OSb.LJIJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C618910OPh c618910OPh = C618910OPh.LIZ;
        DialogC1389620mGW dialogC1389620mGW = c619630OSb.LJIJI;
        Pair[] pairArr = new Pair[4];
        BulletinCommonAbility bulletinCommonAbility2 = c619630OSb.LIZJ;
        String str3 = "";
        if (bulletinCommonAbility2 == null || (string = Long.valueOf(bulletinCommonAbility2.Og2()).toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("channel_id", string);
        pairArr[1] = new Pair("action_type", "click");
        BulletinCommonAbility bulletinCommonAbility3 = c619630OSb.LIZJ;
        if (bulletinCommonAbility3 != null && bulletinCommonAbility3.To()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_author", str2);
        C0OOP c0oop = c619630OSb.LJIILLIIL;
        if (c0oop != null && (l2 = c0oop.LLJJIII) != null && (string3 = l2.toString()) != null) {
            str3 = string3;
        }
        pairArr[3] = new Pair("message_id", str3);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c618910OPh.getClass();
        c619630OSb.LJIJ = C618910OPh.LJFF(context, dialogC1389620mGW, str, mapLJIIIIZZ);
        BulletinListViewModel bulletinListViewModel = c619630OSb.LIZIZ;
        C0OOP c0oop2 = c619630OSb.LJIILLIIL;
        User user = null;
        if (c0oop2 != null && (l = c0oop2.LLJJIII) != null) {
            string2 = l.toString();
        } else {
            string2 = null;
        }
        C0OOP c0oop3 = c619630OSb.LJIILLIIL;
        if (c0oop3 != null) {
            user = c0oop3.LLJJJJLIIL;
        }
        Boolean bool = Boolean.TRUE;
        BulletinListViewModel.OQ2(bulletinListViewModel, string2, "text", c0oop3, user, bool, null, bool, bool, 32);
    }

    public static final void LIZ$14(AkS81S0100000_9 akS81S0100000_9, View view) {
        String str;
        IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
        if (iComplianceBusinessService != null) {
            iComplianceBusinessService.LJJJJJL(((PoiPostPageFragment) akS81S0100000_9.l0).getActivity(), "poi_detail", "clickable_banner");
        }
        PageFinder pageFinderVia = PageFinder.via((Fragment) akS81S0100000_9.l0);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF((PoiPostPageFragment) akS81S0100000_9.l0, null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        c2344009Gk.LJIIIIZZ("enter_from", "poi_detail");
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("login_type", str);
        c2344009Gk.LJIIIIZZ("scenario", CardStruct.IStatusCode.DEFAULT);
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("click_feed_personalization_toast", map, c1185050gwZ);
    }

    public static final void LIZ$2(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((BulletinEditEventGamePlayAssem) akS81S0100000_9.l0).Go();
    }

    public static final void LIZ$3(AkS81S0100000_9 akS81S0100000_9, View view) {
        ((BulletinEditEventGamePlayAssem) akS81S0100000_9.l0).Go();
    }

    public static final void LIZ$4(AkS81S0100000_9 akS81S0100000_9, View view) {
        TuxSkeletonLayout tuxSkeletonLayout;
        Context context;
        String str;
        String string;
        String string2;
        String str2;
        BulletinEditPreviewAssem bulletinEditPreviewAssem = (BulletinEditPreviewAssem) akS81S0100000_9.l0;
        TuxSkeletonLayout tuxSkeletonLayout2 = bulletinEditPreviewAssem.LLJJJ;
        if ((tuxSkeletonLayout2 != null && tuxSkeletonLayout2.LIZJ()) || (tuxSkeletonLayout = bulletinEditPreviewAssem.LLJJJ) == null || (context = tuxSkeletonLayout.getContext()) == null || (str = bulletinEditPreviewAssem.LLJJLIIIJLLLLLLLZ) == null || str.length() == 0) {
            return;
        }
        C11JF c11jf = bulletinEditPreviewAssem.LLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C618910OPh c618910OPh = C618910OPh.LIZ;
        Pair[] pairArr = new Pair[3];
        C0OWL c0owl = (C0OWL) bulletinEditPreviewAssem.LLJJIII.getValue();
        if (c0owl == null || (string = Long.valueOf(c0owl.LL).toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("channel_id", string);
        pairArr[1] = new Pair("action_type", "click");
        String str3 = "1";
        pairArr[2] = new Pair("is_author", "1");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c618910OPh.getClass();
        bulletinEditPreviewAssem.LLJL = C618910OPh.LJFF(context, null, str, mapLJIIIIZZ);
        C0OJC c0ojc = new C0OJC();
        C0OWL c0owl2 = (C0OWL) bulletinEditPreviewAssem.LLJJIII.getValue();
        if (c0owl2 != null && (str2 = c0owl2.LLILLJJLI) != null) {
            c0ojc.LIZ = str2;
        }
        Boolean bool = Boolean.TRUE;
        if (bool != null) {
            c0ojc.LIZIZ = 1;
        }
        C0OWL c0owl3 = (C0OWL) bulletinEditPreviewAssem.LLJJIII.getValue();
        if (c0owl3 != null && (string2 = Long.valueOf(c0owl3.LL).toString()) != null) {
            c0ojc.LIZLLL = string2;
        }
        c0ojc.LJ = "open";
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null) {
            c0ojc.LJFF = curUserId;
        }
        c0ojc.LJIIIIZZ = "text";
        if (bool != null) {
            c0ojc.LJII = 1;
        }
        c0ojc.LJIIJ = "click_preview_link";
        if (!Intrinsics.LJFF(bool, bool)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0ojc.LJIILIIL = str3;
        c0ojc.LIZ();
    }

    public static final void LIZ$5(AkS81S0100000_9 akS81S0100000_9, View view) {
        ArrayList arrayList;
        C0OYG item = ((BulletinCommentMoreCell) akS81S0100000_9.l0).getItem();
        if (item != null) {
            BulletinCommentListViewModel bulletinCommentListViewModel = (BulletinCommentListViewModel) ((BulletinCommentMoreCell) akS81S0100000_9.l0).LLJILLL.getValue();
            List<? extends InterfaceC1891350zJl> listLIZ = bulletinCommentListViewModel.getState().LL.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(listLIZ);
            } else {
                arrayList = new ArrayList();
            }
            int iIndexOf = arrayList.indexOf(item);
            C0OYG c0oygLIZ = C0OYG.LIZ(item, 0, 0, 0, C0OYT.STATUS_LOADING, 0, false, 111);
            ListProtector.set(arrayList, iIndexOf, c0oygLIZ);
            bulletinCommentListViewModel.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 655));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinCommentListViewModel), C0PEM.LIZJ, null, new C0OYF(arrayList, item, iIndexOf, c0oygLIZ, bulletinCommentListViewModel, null), 2);
        }
    }

    public static final void LIZ$6(AkS81S0100000_9 akS81S0100000_9, View view) {
        ArrayList arrayList;
        Integer numValueOf;
        Object next;
        boolean z;
        C0OYG item = ((BulletinCommentMoreCell) akS81S0100000_9.l0).getItem();
        if (item != null) {
            AssemViewModel assemViewModel = (AssemViewModel) ((BulletinCommentMoreCell) akS81S0100000_9.l0).LLJILLL.getValue();
            List<? extends InterfaceC1891350zJl> listLIZ = ((C0OYC) assemViewModel.getState()).LL.LIZ();
            if (listLIZ != null) {
                arrayList = new ArrayList(listLIZ);
            } else {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C0OTS) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                numValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C0OTS) next).LL.getCid(), item.LL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0OTS c0ots = (C0OTS) next;
            if (c0ots != null) {
                C118300cf c118300cf = new C118300cf();
                C19719612Di.LJJIIJ(arrayList, new AwS375S0200000_9(c0ots, c118300cf, 170), true);
                int iIndexOf = arrayList.indexOf(item);
                List<Comment> replyComments = c0ots.LL.getReplyComments();
                if (replyComments != null) {
                    numValueOf = Integer.valueOf(replyComments.size());
                }
                int iMax = Math.max(C1527905yX.LIZ(numValueOf) - c118300cf.element, 0);
                int replyCommentTotal = (int) c0ots.LL.getReplyCommentTotal();
                C0OYT.Companion.getClass();
                if (replyCommentTotal > iMax) {
                    z = true;
                } else {
                    z = false;
                }
                ListProtector.set(arrayList, iIndexOf, C0OYG.LIZ(item, iMax, 0, 0, C0OYU.LIZ(replyCommentTotal, iMax, item.LLILLL, z), 0, z, 45));
                assemViewModel.setState(new AwS588S0100000_9(arrayList, (List<InterfaceC1891350zJl>) 654));
            }
        }
    }

    public static final void LIZ$7(AkS81S0100000_9 akS81S0100000_9, View view) {
        Context context = ((MusicDetailNavBarAssem) akS81S0100000_9.l0).getContext();
        if (context != null) {
            C05HM.LIZIZ.LJJIJLIJ(context, "MDP");
        }
    }

    public static final void LIZ$8(AkS81S0100000_9 akS81S0100000_9, View view) {
        TT2DspAlbumInfo tT2DspAlbumInfo;
        TT2DspAlbumInfo tT2DspAlbumInfo2;
        PreSaveInfo preSaveInfo;
        MusicPresaveButtonAssem musicPresaveButtonAssem = (MusicPresaveButtonAssem) akS81S0100000_9.l0;
        Music music = musicPresaveButtonAssem.LLJJIJI;
        String str = null;
        if (music != null) {
            tT2DspAlbumInfo = music.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo = null;
        }
        MusicPresaveButtonAssem.lp(musicPresaveButtonAssem, false, true, 1);
        Music music2 = musicPresaveButtonAssem.LLJJIJI;
        if (music2 != null) {
            C633020OsG.LIZIZ.LJIJ(music2);
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        String str2 = (String) musicPresaveButtonAssem.LLJJI.getValue();
        Music music3 = musicPresaveButtonAssem.LLJJIJI;
        if (music3 != null) {
            tT2DspAlbumInfo2 = music3.getTT2DspAlbumInfo();
        } else {
            tT2DspAlbumInfo2 = null;
        }
        String strLJJII = c633020OsG.LJJII("single_song", str2, CardStruct.IStatusCode.DEFAULT, music3, tT2DspAlbumInfo2);
        if (tT2DspAlbumInfo != null && (preSaveInfo = tT2DspAlbumInfo.preSaveInfo) != null) {
            str = preSaveInfo.schema;
        }
        SmartRouter.buildRoute(musicPresaveButtonAssem.getContext(), UriProtector.parse(str).buildUpon().appendQueryParameter("log_extra", strLJJII).build().toString()).open();
    }

    public static final void LIZ$9(AkS81S0100000_9 akS81S0100000_9, View view) {
        int bindingAdapterPosition;
        SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel = (SearchProsConsTabAssemViewModel) ((SearchProsConsTagPowerCell) akS81S0100000_9.l0).LL.getValue();
        if (searchProsConsTabAssemViewModel != null && (bindingAdapterPosition = ((SearchProsConsTagPowerCell) akS81S0100000_9.l0).getBindingAdapterPosition()) >= 0) {
            searchProsConsTabAssemViewModel.withState(new AwS112S0101000_4(bindingAdapterPosition, searchProsConsTabAssemViewModel, 1));
        }
    }

    public AkS81S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS81S0100000_9(Object obj, int i, int i2) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }
}
