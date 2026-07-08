package kotlin.jvm.internal;

import X.C09AY;
import X.C0N14;
import X.C0O2L;
import X.C0OGJ;
import X.C0OI7;
import X.C0OII;
import X.C0SZ4;
import X.C1163440gNi;
import X.C13LE;
import X.C13LP;
import X.C1485060okS;
import X.C1686390tzB;
import X.C1720106oR;
import X.C2187451AjH;
import X.C291001Au;
import X.C614740O9g;
import X.C618720OOo;
import X.C623610Od5;
import X.C627260Oiy;
import X.C630370Onz;
import X.C631640Oq2;
import X.C631690Oq7;
import X.C632540OrU;
import X.C731530Sml;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM;
import com.ss.android.ugc.aweme.detail.prefab.DetailCoverAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchCardListAssem;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicListNewFragment;
import com.ss.android.ugc.aweme.music.assem.MusicStatusAssem;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import com.ss.android.ugc.aweme.template.assem.TemplateCoverAssem;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateStructModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS97S0110000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        String strLIZ = C618720OOo.LIZ(((TitlePanelBottomBarFavoriteVM) awS97S0110000_9.l0).LLILLJJLI);
        boolean z = awS97S0110000_9.z1;
        obj.getClass();
        return new C614740O9g(strLIZ, z);
    }

    public static final Object invoke$1(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        WorkBenchNoticeResponse workBenchNoticeResponse = ((C623610Od5) obj).LL;
        if (workBenchNoticeResponse != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("disable_workbench_preload_fragment_rebuild", true)) {
                if (awS97S0110000_9.z1) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("WorkBenchCardListAssem", "is init refresh");
                    WorkBenchCardListViewModel workBenchCardListViewModelIp = ((WorkBenchCardListAssem) awS97S0110000_9.l0).ip();
                    workBenchCardListViewModelIp.LLILZLL = workBenchNoticeResponse;
                    workBenchCardListViewModelIp.LLILLJJLI = workBenchNoticeResponse.getLastReadTimeInSession();
                    workBenchCardListViewModelIp.LLILLL = workBenchNoticeResponse.getWallTime();
                    workBenchCardListViewModelIp.LLJ.clear();
                    workBenchCardListViewModelIp.LLJILJILJ = false;
                    if (workBenchCardListViewModelIp.LLJJ && workBenchCardListViewModelIp.LLJILLL) {
                        workBenchCardListViewModelIp.manualListRefresh();
                        C1720106oR.LIZ("wwzcc", "refreshparams");
                    } else {
                        workBenchCardListViewModelIp.LLJJI = true;
                    }
                } else {
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LIZ("WorkBenchCardListAssem", "is init cache");
                    ((WorkBenchCardListAssem) awS97S0110000_9.l0).ip().LLILZIL = workBenchNoticeResponse;
                }
            } else {
                ((WorkBenchCardListAssem) awS97S0110000_9.l0).ip().LLILZLL = workBenchNoticeResponse;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        return C0O2L.LIZ((C0O2L) obj, null, null, new Pair(Boolean.valueOf(awS97S0110000_9.z1), (C0N14) awS97S0110000_9.l0), 3);
    }

    public static final Object invoke$11(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        boolean z = awS97S0110000_9.z1;
        C1485060okS c1485060okS = (C1485060okS) awS97S0110000_9.l0;
        return C630370Onz.LIZ((C630370Onz) obj, z ? 1 : 0, c1485060okS.LIZLLL, new C291001Au(Integer.valueOf(c1485060okS.LJIIIZ)), null, 8);
    }

    public static final Object invoke$12(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) awS97S0110000_9.l0;
        return C731530Sml.LIZ((C731530Sml) obj, videoFavoriteVM.wQ2(videoFavoriteVM.LL, videoFavoriteVM.AQ2(), ((VideoFavoriteVM) awS97S0110000_9.l0).LLILLL), new C291001Au(Boolean.valueOf(awS97S0110000_9.z1)), null, null, null, null, null, 124);
    }

    public static final Object invoke$13(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) awS97S0110000_9.l0;
        return C731530Sml.LIZ((C731530Sml) obj, videoFavoriteVM.wQ2(videoFavoriteVM.LL, videoFavoriteVM.AQ2(), ((VideoFavoriteVM) awS97S0110000_9.l0).LLILLL), new C291001Au(Boolean.valueOf(awS97S0110000_9.z1)), null, null, null, null, null, 124);
    }

    public static final Object invoke$2(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        boolean z;
        C631640Oq2 c631640Oq2 = (C631640Oq2) obj;
        if (c631640Oq2 != null) {
            if (!awS97S0110000_9.z1 && ((OriginMusicListNewFragment) awS97S0110000_9.l0).getUserVisibleHint()) {
                z = true;
            } else {
                z = false;
            }
            return C631640Oq2.LIZ(c631640Oq2, null, null, null, new C291001Au(Boolean.valueOf(z)), 3967);
        }
        return null;
    }

    public static final Object invoke$3(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        return C631690Oq7.LIZ((C631690Oq7) obj, ((C0OGJ) awS97S0110000_9.l0).LIZ, awS97S0110000_9.z1, null, 4);
    }

    public static final Object invoke$4(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        if ((obj instanceof C1686390tzB) && awS97S0110000_9.z1) {
            ((AddSongEntranceViewModel) awS97S0110000_9.l0).onShow(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        C632540OrU c632540OrU = (C632540OrU) obj;
        if (awS97S0110000_9.z1) {
            c632540OrU.getClass();
            List listLIZ = C627260Oiy.LIZ(c632540OrU);
            if (listLIZ == null || listLIZ.isEmpty()) {
                ((MusicStatusAssem) awS97S0110000_9.l0).Fp();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        Object objLJJJLL;
        int i;
        int i2;
        UrlModel thumbnailUrl;
        List<String> urlList;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(DetailCoverAssem.class);
        c0sz4.LLJIJIL = C1163440gNi.LIZJ;
        TemplateStructModel templateInfo = ((TemplateDetailModel) awS97S0110000_9.l0).getTemplateInfo();
        if (templateInfo != null && (thumbnailUrl = templateInfo.getThumbnailUrl()) != null && (urlList = thumbnailUrl.getUrlList()) != null) {
            objLJJJLL = C13LP.LJJJLL(urlList);
        } else {
            objLJJJLL = null;
        }
        c0sz4.LJ(String.valueOf(objLJJJLL), "img_url");
        int i3 = 120;
        if (awS97S0110000_9.z1) {
            i = 120;
        } else {
            i = 80;
        }
        c0sz4.LJ(Integer.valueOf(i), "width_dp");
        if (!awS97S0110000_9.z1) {
            i3 = 80;
        }
        c0sz4.LJ(Integer.valueOf(i3), "height_dp");
        if (awS97S0110000_9.z1) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        c0sz4.LJ(Integer.valueOf(i2), "rounded_corner_radius");
        c0sz4.LJ("CENTER_CROP", "scale_type");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        String coverIcon;
        int i;
        int i2;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = C13LE.LIZ(TemplateCoverAssem.class);
        c0sz4.LLJIJIL = C1163440gNi.LIZJ;
        TemplateAnchorConfig templateAnchorConfig = ((TemplateDetailFragment) awS97S0110000_9.l0).LLJI;
        if (templateAnchorConfig == null || (coverIcon = templateAnchorConfig.getCoverIcon()) == null) {
            coverIcon = "";
        }
        c0sz4.LJ(coverIcon, "img_url");
        int i3 = 120;
        if (awS97S0110000_9.z1) {
            i = 120;
        } else {
            i = 80;
        }
        c0sz4.LJ(Integer.valueOf(i), "width_dp");
        if (!awS97S0110000_9.z1) {
            i3 = 80;
        }
        c0sz4.LJ(Integer.valueOf(i3), "height_dp");
        if (awS97S0110000_9.z1) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        c0sz4.LJ(Integer.valueOf(i2), "rounded_corner_radius");
        c0sz4.LJ("CENTER_CROP", "scale_type");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        C0OI7 c0oi7 = (C0OI7) obj;
        if (awS97S0110000_9.z1) {
            c0oi7.LIZ(C0OII.LJII, (BulletinChannelAccessControl) awS97S0110000_9.l0);
        } else {
            c0oi7.LIZIZ(C0OII.LJII, (BulletinChannelAccessControl) awS97S0110000_9.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS97S0110000_9 awS97S0110000_9, Object obj) {
        ((BulletinAutoPlayViewModel) awS97S0110000_9.l0).setState(new AwS24S0010000_9(awS97S0110000_9.z1, 19));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(C0OGJ c0ogj, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ogj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(C1485060okS c1485060okS, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1485060okS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(TitlePanelBottomBarFavoriteVM titlePanelBottomBarFavoriteVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = titlePanelBottomBarFavoriteVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(VideoFavoriteVM videoFavoriteVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoFavoriteVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(BulletinAutoPlayViewModel bulletinAutoPlayViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinAutoPlayViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(OriginMusicListNewFragment originMusicListNewFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = originMusicListNewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(AddSongEntranceViewModel addSongEntranceViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = addSongEntranceViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(TemplateDetailFragment templateDetailFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(TemplateDetailModel templateDetailModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(boolean z, C0N14 c0n14, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c0n14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(boolean z, WorkBenchCardListAssem workBenchCardListAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = workBenchCardListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(boolean z, MusicStatusAssem musicStatusAssem, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = musicStatusAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0110000_9(boolean z, BulletinChannelAccessControl bulletinChannelAccessControl, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = bulletinChannelAccessControl;
    }
}
