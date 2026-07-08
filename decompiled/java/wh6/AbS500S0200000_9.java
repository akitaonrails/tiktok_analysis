package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0O46;
import X.C0OP4;
import X.C0OPQ;
import X.C0OPT;
import X.C0OPX;
import X.C0OYY;
import X.C105700ad;
import X.C12ES;
import X.C1370940lmO;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1629106Zl;
import X.C1720106oR;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2241931Cox;
import X.C2344009Gk;
import X.C417460GYm;
import X.C616420OFs;
import X.C617580OKe;
import X.C624290OeB;
import X.C624310OeD;
import X.C632070Oqj;
import X.C637380OzI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C827203La;
import X.InterfaceC1260110itd;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinProfileEditFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardShareAbilityHandler;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinCopyLinkChannel;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinProfileToolkitCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinQuickPostCell;
import com.ss.android.ugc.aweme.music.assem.MusicListArtistCertificationAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinToolkitModel;
import com.ss.android.ugc.aweme.topic.book.detail.BookDescAssem;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.movie.detail.MovieDescAssem;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public class AbS500S0200000_9 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS500S0200000_9 abS500S0200000_9, View view) {
        Long l;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String string;
        C19EG c19egLJ;
        String string2;
        C19EG c19egLJ2;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((BulletinProfileToolkitCell) abS500S0200000_9.l0).LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinProfileToolkitCell.LLJ;
            PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
            panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
            Integer type = ((BulletinToolkitModel) abS500S0200000_9.l1).getType();
            if (type != null && type.intValue() == 1) {
                BulletinProfileToolkitCell bulletinProfileToolkitCell = (BulletinProfileToolkitCell) abS500S0200000_9.l0;
                BulletinShareModel bulletinShareModel = bulletinProfileToolkitCell.I5().getState().LLILZ;
                if (bulletinShareModel != null && (c19egLJ2 = C737910Sx3.LJ(bulletinProfileToolkitCell.itemView.getContext())) != null) {
                    C0OYY c0oyy = BulletinBoardInviteSharePackage.Companion;
                    View view2 = bulletinProfileToolkitCell.itemView;
                    c0oyy.getClass();
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("from_bb_channel_id", bulletinShareModel.bulletinId));
                    BaseTemplate baseTemplateLIZIZ = C2241931Cox.LIZIZ(2000, bulletinShareModel.contentPb);
                    if (baseTemplateLIZIZ != null) {
                        SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask("bulletin_share", baseTemplateLIZIZ, new SendMessageEventParcel("bulletin_board_page", null, null, "creation_guide", null, C105700ad.LIZIZ(mapLIZJ), 22), null, false, 24);
                        C1370940lmO c1370940lmOLJIIIIZZ = new C617580OKe(bulletinShareModel, c19egLJ2).LJIIIIZZ();
                        c1370940lmOLJIIIIZZ.LJIIIIZZ = sendMessageTemplateTask;
                        BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage = new BulletinBoardInviteSharePackage(c1370940lmOLJIIIIZZ);
                        C786410Ut5.LJJJI("enter_from", "bulletin_board_page", bulletinBoardInviteSharePackage.extras);
                        C786410Ut5.LJJJI("enter_method", "creation_guide", bulletinBoardInviteSharePackage.extras);
                        Context baseContext = c19egLJ2.getBaseContext();
                        new BulletinBoardShareAbilityHandler(baseContext).LJIIJJI(baseContext, view2, bulletinBoardInviteSharePackage, new BulletinCopyLinkChannel(view2));
                    }
                }
            } else if (type != null && type.intValue() == 2) {
                BulletinProfileToolkitCell bulletinProfileToolkitCell2 = (BulletinProfileToolkitCell) abS500S0200000_9.l0;
                BulletinShareModel bulletinShareModel2 = bulletinProfileToolkitCell2.I5().getState().LLILZ;
                if (bulletinShareModel2 != null && (c19egLJ = C737910Sx3.LJ(bulletinProfileToolkitCell2.itemView.getContext())) != null) {
                    BulletinBoardInviteSharePackage.Companion.getClass();
                    C0OYY.LIZ(bulletinShareModel2, c19egLJ, "bulletin_board_page", "creation_guide");
                }
            } else if (type != null && type.intValue() == 3) {
                BulletinProfileToolkitCell bulletinProfileToolkitCell3 = (BulletinProfileToolkitCell) abS500S0200000_9.l0;
                BulletinBoardInfo bulletinBoardInfoLIZ = bulletinProfileToolkitCell3.I5().getState().LL.LIZ();
                if (bulletinBoardInfoLIZ != null && (l = bulletinBoardInfoLIZ.editQuota) != null) {
                    long jLongValue = 0;
                    if (l.longValue() <= 0) {
                        Context context = bulletinProfileToolkitCell3.getContext();
                        if (context != null && (string = context.getString(2131828114)) != null) {
                            C0OPX.LJIIZILJ(C827203La.LIZIZ(bulletinProfileToolkitCell3.getCurrentLifeCycleOwner()), string);
                        }
                    } else {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("enter_from", "bulletin_board_page", bundle);
                        C786410Ut5.LJJJI("enter_method", "creation_guide", bundle);
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        Long l2 = bulletinProfileToolkitCell3.I5().LLILLJJLI;
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        }
                        BulletinProfileEditFragment bulletinProfileEditFragment = new BulletinProfileEditFragment(jLongValue, bulletinProfileToolkitCell3.I5().LLILLL, bulletinProfileToolkitCell3.I5().LLILZ, false);
                        bulletinProfileEditFragment.setArguments(bundle);
                        c1390920mIc.LIZ.LLJJIJI = bulletinProfileEditFragment;
                        c1390920mIc.LJIIIIZZ(1);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJLILLLLZIIL = false;
                        tuxSheet.LLJLL = true;
                        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(bulletinProfileToolkitCell3.getContext())) * 0.86d);
                        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                        tuxSheet2.LLJJL = iLJIIIIZZ;
                        Context context2 = bulletinProfileToolkitCell3.getContext();
                        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                            tuxSheet2.show(supportFragmentManager, "bulletin_profile_edit");
                        }
                    }
                }
            } else {
                if (((BulletinToolkitModel) abS500S0200000_9.l1).getSchemaUrl() != null && (!a0.LJJJIL(r1))) {
                    SmartRouter.buildRoute(((BulletinProfileToolkitCell) abS500S0200000_9.l0).itemView.getContext(), ((BulletinToolkitModel) abS500S0200000_9.l1).getSchemaUrl()).open();
                }
            }
            C0OPQ c0opq = C0OPQ.LIZ;
            Long l3 = ((BulletinProfileToolkitCell) abS500S0200000_9.l0).I5().LLILLJJLI;
            if (l3 == null || (string2 = l3.toString()) == null) {
                string2 = "";
            }
            List<BulletinCardKV> eventParams = ((BulletinToolkitModel) abS500S0200000_9.l1).getEventParams();
            c0opq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("channel_id", string2);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            C0OPQ.LIZLLL(c2344009Gk, eventParams);
            C20684815ws.LJIILLIIL("bulletin_board_creation_guide_button", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$1(AbS500S0200000_9 abS500S0200000_9, View view) {
        if (view != null) {
            ((BulletinQuickPostCell) abS500S0200000_9.l0).Yl(((BulletinPublishAction) abS500S0200000_9.l1).getPublishActionType(), ((BulletinPublishAction) abS500S0200000_9.l1).getSchema(), ((BulletinPublishAction) abS500S0200000_9.l1).getExtra(), true);
            if (((View) ((BulletinQuickPostCell) abS500S0200000_9.l0).LLJI.getValue()).getVisibility() == 0) {
                C786410Ut5.g0((C417460GYm) ((BulletinQuickPostCell) abS500S0200000_9.l0).LLJI.getValue(), 8);
                C0OPT.LIZ.getClass();
                C0OPT.LIZIZ();
            }
        }
    }

    public static final void LIZ$2(AbS500S0200000_9 abS500S0200000_9, View view) {
        if (view != null) {
            C632070Oqj.LIZIZ().storeBoolean("key_music_sound_on_banner_closed", true);
            ((ViewOnAttachStateChangeListenerC20604515jv) ((MusicListArtistCertificationAssem) abS500S0200000_9.l0).LLJ.getValue()).LJJ((View) abS500S0200000_9.l1);
        }
    }

    public static final void LIZ$3(AbS500S0200000_9 abS500S0200000_9, View view) {
        String str;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((TuxTextView) abS500S0200000_9.l0).getContext(), "//topic/book/info");
            AssemVMLazy assemVMLazy = ((BookDescAssem) abS500S0200000_9.l1).LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BookDescAssem.LLJJIJIL;
            smartRouteBuildRoute.withParam("book_id", ((BookDetailVM) assemVMLazy.getValue()).vQ2());
            smartRouteBuildRoute.open();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("book_id", ((BookDetailVM) ((BookDescAssem) abS500S0200000_9.l1).LLJJIJIIJIL.getValue()).vQ2());
            BookDetail bookDetailLIZ = ((C0O46) ((BookDescAssem) abS500S0200000_9.l1).LLJJIJIIJIL.getValue().getState()).LL.LIZ();
            if (bookDetailLIZ != null) {
                str = bookDetailLIZ.title;
            } else {
                str = null;
            }
            pairArr[1] = new Pair("book_title", str);
            C20684815ws.LJIILLIIL("click_book_detail_more", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    public static final void LIZ$4(AbS500S0200000_9 abS500S0200000_9, View view) {
        String str;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((TuxTextView) abS500S0200000_9.l0).getContext(), "//topic/movie/info");
            smartRouteBuildRoute.withParam("movie_id", ((MovieDescAssem) abS500S0200000_9.l1).lp().vQ2());
            smartRouteBuildRoute.open();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("movie_id", ((MovieDescAssem) abS500S0200000_9.l1).lp().vQ2());
            MovieDetail movieDetailLIZ = ((MovieDescAssem) abS500S0200000_9.l1).lp().getState().LL.LIZ();
            if (movieDetailLIZ != null) {
                str = movieDetailLIZ.title;
            } else {
                str = null;
            }
            pairArr[1] = new Pair("movie_title", str);
            C20684815ws.LJIILLIIL("click_movie_detail_more", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    public static final void LIZ$5(AbS500S0200000_9 abS500S0200000_9, View view) {
        InterfaceC1260110itd interfaceC1260110itd;
        if (view != null && (interfaceC1260110itd = ((C616420OFs) abS500S0200000_9.l0).LLIZ) != null) {
            interfaceC1260110itd.I2(new Aweme(), (View) abS500S0200000_9.l1, "_addyours_topic_report_link");
        }
    }

    public static final void LIZ$6(AbS500S0200000_9 abS500S0200000_9, View view) {
        String str;
        if (view != null) {
            ((Function0) abS500S0200000_9.l0).invoke();
            C0OP4.LIZ.getClass();
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("BulletinBoardGuideUtils", "clickIgnore()");
            C0OP4.LIZJ = true;
            C0OP4.LIZJ(true);
            C0OPQ c0opq = C0OPQ.LIZ;
            C624310OeD c624310OeD = ((C624290OeB) abS500S0200000_9.l1).LL;
            if (c624310OeD != null) {
                str = c624310OeD.LLIZ;
            } else {
                str = null;
            }
            c0opq.getClass();
            C0OPQ.LJIILL(2, "ignore", str);
            C637380OzI.LIZ.getClass();
            C637380OzI.LIZIZ("bulletin_board_guide", null, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS500S0200000_9(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS500S0200000_9(Object obj, Object obj2, int i, int i2) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
