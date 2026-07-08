package com.ss.android.ugc.aweme.share;

import X.AbstractC1377270lwb;
import X.AbstractC1549150qPp;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C036E;
import X.C07K5;
import X.C086I;
import X.C08YU;
import X.C0C64;
import X.C0CLT;
import X.C0CLW;
import X.C0R01;
import X.C0R23;
import X.C0SU5;
import X.C0SXF;
import X.C0XQ7;
import X.C10EU;
import X.C1209570ha7;
import X.C123100dR;
import X.C1233040iBy;
import X.C1238740iLA;
import X.C1259870itF;
import X.C1260870iur;
import X.C1324840ka2;
import X.C1357300lQO;
import X.C1357680lR0;
import X.C1369770lkV;
import X.C1370370llT;
import X.C1371040lmY;
import X.C1371600lnS;
import X.C1371710lnd;
import X.C1372180loO;
import X.C1372210loR;
import X.C1373290lqB;
import X.C1373540lqa;
import X.C1373850lr5;
import X.C1374530lsB;
import X.C1374550lsD;
import X.C1374660lsO;
import X.C1374810lsd;
import X.C1374820lse;
import X.C1374830lsf;
import X.C1374860lsi;
import X.C1374870lsj;
import X.C1374890lsl;
import X.C1374940lsq;
import X.C1374950lsr;
import X.C1374980lsu;
import X.C1375000lsw;
import X.C1375070lt3;
import X.C1375110lt7;
import X.C1375120lt8;
import X.C1375150ltB;
import X.C1375340ltU;
import X.C1375350ltV;
import X.C1375400lta;
import X.C1375440lte;
import X.C1375730lu7;
import X.C1375740lu8;
import X.C1375890luN;
import X.C1376170lup;
import X.C1376210lut;
import X.C1376270luz;
import X.C1376290lv1;
import X.C1376300lv2;
import X.C1376680lve;
import X.C1377040lwE;
import X.C1377070lwH;
import X.C1377830lxV;
import X.C1377920lxe;
import X.C1379160lze;
import X.C1379220lzk;
import X.C1379920m0s;
import X.C1379930m0t;
import X.C1380390m1d;
import X.C1381070m2j;
import X.C1387490mD5;
import X.C1389890mGx;
import X.C1445970njP;
import X.C1697810uHb;
import X.C19EG;
import X.C20684815ws;
import X.C20703515zt;
import X.C2188811AlT;
import X.C2241008qG;
import X.C2344009Gk;
import X.C297600BlW;
import X.C352000Dr4;
import X.C353310DtB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C604560NnS;
import X.C604730Nnj;
import X.C687600Qy6;
import X.C688130Qyx;
import X.C733420Spo;
import X.C735420St2;
import X.C737030Svd;
import X.C737310Sw5;
import X.C746760TRa;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C790120Uz4;
import X.C793770VBv;
import X.C794240VDq;
import X.C994003uc;
import X.EnumC114200c0;
import X.EnumC1371620lnU;
import X.EnumC1373410lqN;
import X.EnumC1377930lxf;
import X.InterfaceC1167780gUi;
import X.InterfaceC1167830gUn;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370110ll3;
import X.InterfaceC1370310llN;
import X.InterfaceC1371630lnV;
import X.InterfaceC1377050lwF;
import Y.AComparatorS362S0200000_5;
import Y.AObjectS195S0300000_21;
import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentShareACL;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.MemeRegInfo;
import com.ss.android.ugc.aweme.feed.model.MemeVideoReg;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinBoardInviteSharePackage;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.presenter.MusicSharePackageV2;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ShareExtServiceImpl extends AbstractC1377270lwb {
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LIZ() {
        C1375730lu7.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LIZLLL() {
        if (!C1376270luz.LIZJ && !C1376270luz.LIZLLL && !C1375730lu7.LIZIZ.LJIIIZ()) {
            C1376300lv2.LIZ.getClass();
            if (!C1376300lv2.LIZJ) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0R01] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C0R01 LJI() {
        return new InterfaceC1370310llN() { // from class: X.0R01
            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_person_music_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_person_music;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131837723;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "music_credits";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                Music music;
                FragmentManager supportFragmentManager;
                String string = baseSharePackage.extras.getString("enter_from");
                String string2 = baseSharePackage.extras.getString("enter_method");
                String string3 = baseSharePackage.extras.getString("previous_page");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", string);
                c2344009Gk.LJIIIIZZ("enter_method", string2);
                c2344009Gk.LJIIIIZZ("previous_page", string3);
                C20684815ws.LJIILLIIL("share_credits_click", c2344009Gk.LIZ);
                ShareModel shareModel = baseSharePackage.shareModel;
                Serializable serializable = null;
                if (shareModel != null) {
                    serializable = shareModel.customModel;
                }
                if ((serializable instanceof Music) && (music = (Music) serializable) != null) {
                    int i = baseSharePackage.extras.getInt("artist_label", 0);
                    int i2 = baseSharePackage.extras.getInt("behind_song_video_type", 0);
                    List<MusicOwnerInfo> listLJIIJ = ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJIIJ(music);
                    Bundle bundle = new Bundle();
                    C1227904rF.LIZ.getClass();
                    C786410Ut5.LJJJI("extra_artist_profile", C1227904rF.LJI(listLJIIJ), bundle);
                    C786410Ut5.LJJIZ(bundle, "extra_music", music);
                    C786410Ut5.LJJJI("extra_enter_type", string, bundle);
                    C786410Ut5.LJJJI("extra_enter_method", "credits_channel", bundle);
                    bundle.putBoolean("extra_show_follow_btn", true);
                    bundle.putInt("extra_artist_label", i);
                    bundle.putInt("extra_behind_the_song_video_type", i2);
                    bundle.putBoolean("extra_is_from_music_credits", true);
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LIZLLL(bundle, supportFragmentManager);
                    }
                }
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lt3] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1375070lt3 LJIIIIZZ() {
        return new InterfaceC1371630lnV<InterfaceC1370310llN>() { // from class: X.0lt3
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1371630lnV
            public final List<InterfaceC1370310llN> LIZIZ(List<InterfaceC1370310llN> list) {
                C1376000luY.LIZIZ(list);
                C1376000luY.LIZ(list);
                return list;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIIL() {
        C1372210loR.LIZ.getClass();
        return C1372210loR.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJJIFFI() {
        C1372210loR.LIZ.getClass();
        return C1372210loR.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJ() {
        C1372210loR.LIZ.getClass();
        C1372210loR.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Map<String, String> LJJJJL() {
        return (Map) C07K5.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJZI() {
        if (C1375150ltB.LIZJ) {
            return;
        }
        C1375150ltB.LIZ.getClass();
        C01GW c01gw = C1375150ltB.LIZIZ;
        long j = ((Keva) c01gw.getValue()).getLong("keva_external_share_sort_hour_time", 0L);
        long jCurrentTimeMillis = j == 0 ? -1L : System.currentTimeMillis() - j;
        ((Keva) c01gw.getValue()).storeLong("keva_external_share_sort_hour_time", System.currentTimeMillis());
        long hours = jCurrentTimeMillis > 0 ? TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis) : -1L;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(hours, "duration");
        C20684815ws.LJIILLIIL("share_setting_parse", c2344009Gk.LIZ);
        C1375150ltB.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Map<String, InterfaceC1369790lkX> LJJLIIIJ() {
        C1374660lsO.LIZ.getClass();
        return C1374660lsO.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1374890lsl LJJZZI() {
        return new C1374890lsl();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJLI() {
        if (C1375000lsw.LIZ) {
            C01GW c01gw = C604730Nnj.LIZ;
            Keva keva = (Keva) c01gw.getValue();
            C01GW c01gw2 = C604730Nnj.LIZIZ;
            ((Keva) c01gw.getValue()).storeInt((String) c01gw2.getValue(), keva.getInt((String) c01gw2.getValue(), 0) + 1);
        }
        C1375000lsw.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final List LJLIIIL() {
        C1374660lsO.LIZ.getClass();
        return C1374660lsO.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return Collections.singletonList(C604560NnS.class);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String[] LJJIJIIJI() {
        C1374860lsi.LIZJ().getClass();
        C1377830lxV.LIZ.getClass();
        List<? extends SharePlatform> list = C1377830lxV.LIZJ;
        if (list == null || list.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends SharePlatform> it2 = C1377830lxV.LIZJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().platformId);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJJJJLL() {
        return C1238740iLA.LIZIZ().LIZIZ("last_share_way", "outside_channel");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJIIJIL() {
        boolean z = C1375000lsw.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final int LJFF(Aweme aweme) {
        String shareUrl;
        C1374530lsB.LIZ.getClass();
        String strLIZIZ = C1374530lsB.LIZIZ(aweme);
        ShareInfo shareInfo = aweme.getShareInfo();
        if ((shareInfo == null || (shareUrl = shareInfo.getShareUrl()) == null || shareUrl.length() <= 0) && (shareUrl = aweme.getShareUrl()) == null) {
            shareUrl = "";
        }
        C1375890luN.LIZ.getClass();
        return C1375890luN.LIZLLL(strLIZIZ, shareUrl).getNum();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJII(int i) {
        return C1357680lR0.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIIJ(Aweme aweme) {
        String authorUid;
        C1374870lsj.LIZ.getClass();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(authorUid, C1374870lsj.LIZJ.getUid())) {
            C1374870lsj.LIZIZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIIJJI(ShareOperationInfo shareOperationInfo) {
        C1372210loR.LIZ.getClass();
        C1372210loR.LIZ(shareOperationInfo);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILJJIL(Aweme aweme) {
        C1373850lr5.LIZ.getClass();
        if (aweme.getAwemeType() == 150) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILLIIL(Comment comment) {
        CommentShareInfo shareInfo;
        CommentShareACL acl;
        String vid;
        if (comment != null && (shareInfo = comment.getShareInfo()) != null && (acl = shareInfo.getAcl()) != null && acl.getCode() == 0) {
            if (comment.getAudioStruct() != null) {
                CmtAudioStruct audioStruct = comment.getAudioStruct();
                String localPath = null;
                if (audioStruct != null) {
                    vid = audioStruct.getVid();
                } else {
                    vid = null;
                }
                if (!C123100dR.LIZ(vid)) {
                    CmtAudioStruct audioStruct2 = comment.getAudioStruct();
                    if (audioStruct2 != null) {
                        localPath = audioStruct2.getLocalPath();
                    }
                    if (!C123100dR.LIZ(localPath)) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIL(MusicSharePackageV2 musicSharePackageV2) {
        C1369770lkV.LIZ(musicSharePackageV2);
        C1369770lkV.LIZLLL(musicSharePackageV2);
        C1369770lkV.LJIIIIZZ(musicSharePackageV2);
        C1369770lkV.LJII(musicSharePackageV2);
        C1369770lkV.LIZJ(musicSharePackageV2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJJ(Activity activity) {
        InterfaceC1369790lkX interfaceC1369790lkXLIZ;
        int iIntValue;
        C1374860lsi.LIZJ().getClass();
        String strLIZJ = C733420Spo.LIZJ();
        if (TextUtils.equals(strLIZJ, "download")) {
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(activity, R.raw.icon_2pt_arrow_to_bottom);
            tuxIconDrawable.LJI(R.attr.a1h, activity);
            int iLIZ = C418440Gaw.LIZ(32);
            tuxIconDrawable.LJII(iLIZ);
            tuxIconDrawable.LJ(iLIZ);
            C384050F3z c384050F3z = new C384050F3z();
            int iLIZ2 = C418440Gaw.LIZ(48);
            c384050F3z.LJII = iLIZ2;
            c384050F3z.LJI = iLIZ2;
            c384050F3z.LIZJ = Float.valueOf(iLIZ2 / 2.0f);
            c384050F3z.LJFF = Integer.valueOf(R.attr.a1h);
            c384050F3z.LIZLLL = Integer.valueOf(C418440Gaw.LIZ(1));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            return new LayerDrawable(new Drawable[]{c384050F3z.LIZ(activity), tuxIconDrawable});
        }
        if ("more".equalsIgnoreCase(strLIZJ)) {
            strLIZJ = "";
        }
        InterfaceC1369790lkX interfaceC1369790lkXLIZ2 = C1371710lnd.LIZ(activity, strLIZJ);
        if (interfaceC1369790lkXLIZ2 != null && interfaceC1369790lkXLIZ2.LJIIZILJ(activity)) {
            return interfaceC1369790lkXLIZ2.LJJII(activity, false);
        }
        C1374860lsi c1374860lsiLIZJ = C1374860lsi.LIZJ();
        LinkedList linkedList = new LinkedList(Arrays.asList(c1374860lsiLIZJ.LIZIZ()));
        int size = linkedList.size();
        String[] strArr = new String[size];
        linkedList.toArray(strArr);
        try {
            if (c1374860lsiLIZJ.LIZLLL != null) {
                HashMap map = new HashMap();
                for (int i = 0; i < size; i++) {
                    map.put(strArr[i], 0);
                }
                List<C353310DtB> listLIZ = c1374860lsiLIZJ.LIZLLL.LIZIZ().LIZ(0, 100);
                if (listLIZ.size() >= 100) {
                    c1374860lsiLIZJ.LJ = Integer.valueOf(listLIZ.get(listLIZ.size() - 1).LIZ);
                }
                if (listLIZ.size() > 10) {
                    listLIZ = listLIZ.subList(0, 10);
                }
                for (C353310DtB c353310DtB : listLIZ) {
                    Integer num = (Integer) map.get(c353310DtB.LIZJ);
                    String str = c353310DtB.LIZJ;
                    if (num == null) {
                        iIntValue = 1;
                    } else {
                        iIntValue = num.intValue() + 1;
                    }
                    map.put(str, Integer.valueOf(iIntValue));
                }
                Arrays.sort(strArr, new AComparatorS362S0200000_5(map, listLIZ, 2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        List<String> listAsList = Arrays.asList(strArr);
        if (!C086I.LIZIZ(listAsList)) {
            for (String str2 : listAsList) {
                if (!TextUtils.equals(str2, "chat_merge") && (interfaceC1369790lkXLIZ = C1371710lnd.LIZ(activity, str2)) != null && interfaceC1369790lkXLIZ.LJIIZILJ(activity)) {
                    return interfaceC1369790lkXLIZ.LJJII(activity, false);
                }
            }
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_ellipsis_circle;
        return c419910GdJ.LIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJI(SharePackage sharePackage) {
        if (sharePackage instanceof DownloadedVideoSharePackage) {
            LJIIJ(((DownloadedVideoSharePackage) sharePackage).aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIII(Aweme aweme) {
        String authorUid;
        C1374870lsj.LIZ.getClass();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(authorUid, C1374870lsj.LIZJ.getUid())) {
            C1374870lsj.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C0R23 LJJIIJZLJL(Music music) {
        return new C0R23(music);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJIIZI(Aweme aweme) {
        C1373850lr5.LIZ.getClass();
        return C1373540lqa.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final List<InterfaceC1369790lkX> LJJIJ(ShareContentType[] shareContentTypeArr) {
        Activity currentActivity;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            currentActivity = interfaceC1370110ll3.getCurrentActivity();
        } else {
            currentActivity = null;
        }
        return C1374550lsD.LIZ(shareContentTypeArr, new C1377070lwH(new C1374830lsf(currentActivity), new C1374820lse(currentActivity)));
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJJIJIL(Context context) {
        C1372210loR.LIZ.getClass();
        return C1372210loR.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJLIJ(BulletinBoardInviteSharePackage bulletinBoardInviteSharePackage) {
        C1369770lkV.LJIIIIZZ(bulletinBoardInviteSharePackage);
        C1369770lkV.LJII(bulletinBoardInviteSharePackage);
        C1369770lkV.LIZJ(bulletinBoardInviteSharePackage);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lt7] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1375110lt7 LJJIZ(Music music) {
        return new C1209570ha7(music) { // from class: X.0lt7
            public final Music LLILLJJLI;

            {
                this.LLILLJJLI = music;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                String musicName;
                int userCount;
                Bundle bundle = new Bundle();
                Music music2 = this.LLILLJJLI;
                if (music2 == null) {
                    musicName = "";
                } else {
                    musicName = music2.getMusicName();
                }
                C786410Ut5.LJJJI("display_name", musicName, bundle);
                Music music3 = this.LLILLJJLI;
                if (music3 == null) {
                    userCount = 0;
                } else {
                    userCount = music3.getUserCount();
                }
                bundle.putLong("display_count", userCount);
                C786410Ut5.LJJJI("enter_from", "music", bundle);
                String string = baseSharePackage.extras.getString("enter_from");
                String string2 = baseSharePackage.extras.getString("enter_method");
                C1372790lpN c1372790lpN = new C1372790lpN(3, this.LLILLJJLI.getMid(), bundle);
                Activity activityLJII = C1375500ltk.LJII(context);
                if (activityLJII != null) {
                    C621180OYa.LIZ.LJIIJ(activityLJII, baseSharePackage.itemType, c1372790lpN, string, string2);
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(this.LLILLJJLI.getId(), "music_id");
                c2344009Gk.LJIIIIZZ("platform", "scan");
                c2344009Gk.LJIIIIZZ("qr_code_type", "shaped");
                c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                C20684815ws.LJIILLIIL("click_qr_code", c2344009Gk.LIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJJJ(Context context) {
        C1372210loR.LIZ.getClass();
        return C1372210loR.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJIL(BaseSharePackage baseSharePackage) {
        C1369770lkV.LJIIIIZZ(baseSharePackage);
        C1369770lkV.LIZJ(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJJLI(String str) {
        C1372210loR.LIZ.getClass();
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJJLJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJLIIL(String str) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("errorDesc", "url is illegal");
        c2241008qG.LIZ.put("url", str);
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("save_video_success_rate", 4, jSONObjectLJ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Qy6] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C687600Qy6 LJJLIIIJJI(Challenge challenge) {
        return new InterfaceC1370310llN(challenge) { // from class: X.0Qy6
            public final Challenge LL;

            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_flag_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_2pt_flag;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return true;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return R.string.s65;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "report_hashtag";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            {
                this.LL = challenge;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                String cid;
                String uid;
                String cid2;
                User author;
                User author2;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "hashtag");
                Challenge challenge2 = this.LL;
                String uid2 = null;
                if (challenge2 != null) {
                    cid = challenge2.getCid();
                } else {
                    cid = null;
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("object_id", cid);
                Challenge challenge3 = this.LL;
                if (challenge3 != null && (author2 = challenge3.getAuthor()) != null) {
                    uid = author2.getUid();
                } else {
                    uid = null;
                }
                ComplianceServiceProvider.LJJ().LIZIZ(C1375500ltk.LJII(context), builderAppendQueryParameter2.appendQueryParameter("owner_id", uid));
                IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
                Challenge challenge4 = this.LL;
                if (challenge4 != null) {
                    cid2 = challenge4.getCid();
                } else {
                    cid2 = null;
                }
                Challenge challenge5 = this.LL;
                if (challenge5 != null && (author = challenge5.getAuthor()) != null) {
                    uid2 = author.getUid();
                }
                iReportServiceLJJ.LIZ("challenge_detail", "hashtag", "", cid2, uid2, "click_share_button");
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJL(String str) {
        C08YU.LIZIZ("more_share_list", str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final EnumC114200c0 LJJLIIIJLLLLLLLZ(String str) {
        C1373850lr5.LIZ.getClass();
        return C1373540lqa.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIJ(ChallengeSharePackageV2 challengeSharePackageV2) {
        C1369770lkV.LIZ(challengeSharePackageV2);
        C1369770lkV.LIZLLL(challengeSharePackageV2);
        C1369770lkV.LJIIIIZZ(challengeSharePackageV2);
        C1369770lkV.LJII(challengeSharePackageV2);
        C1369770lkV.LIZJ(challengeSharePackageV2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C790120Uz4 LJJLJ(String str) {
        return new C790120Uz4(str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJZ(Aweme aweme) {
        C1374870lsj.LIZ.getClass();
        aweme.getAid();
        C1374870lsj.LIZIZ = false;
        C1374870lsj.LIZIZ().storeLong("last_publish_success_time", System.currentTimeMillis());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Qyx] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C688130Qyx LJL(Music music) {
        return new InterfaceC1370310llN(music) { // from class: X.0Qyx
            public final Music LL;

            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_flag_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_2pt_flag;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return true;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131846333;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "report_music";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            {
                this.LL = music;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                String ownerId;
                if (TextUtils.isEmpty(this.LL.getOwnerId())) {
                    ownerId = CardStruct.IStatusCode.DEFAULT;
                } else {
                    ownerId = this.LL.getOwnerId();
                }
                ComplianceServiceProvider.LJJ().LIZIZ(C1375500ltk.LJII(context), new Uri.Builder().appendQueryParameter("report_type", "music").appendQueryParameter("object_id", this.LL.getMid()).appendQueryParameter("owner_id", ownerId));
                ComplianceServiceProvider.LJJ().LIZ("", "music", "", this.LL.getMid(), this.LL.getOwnerId(), "click_share_button");
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJLIIL(Aweme aweme) {
        C1376270luz.LIZ.getClass();
        C1376270luz.LJFF = aweme;
    }

    @Override // X.AbstractC1377270lwb, com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJLIL(TakoImageSharePackage takoImageSharePackage) {
        if (C1371040lmY.LIZLLL()) {
            C1369770lkV.LIZ(takoImageSharePackage);
            C1369770lkV.LIZLLL(takoImageSharePackage);
            C1369770lkV.LJIIIIZZ(takoImageSharePackage);
            C1369770lkV.LJII(takoImageSharePackage);
            C1369770lkV.LIZJ(takoImageSharePackage);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0St2] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C735420St2 LJLILLLLZI(Aweme aweme) {
        return new InterfaceC1370310llN(aweme) { // from class: X.0St2
            public final Aweme LL;
            public final String LLILLJJLI = "";
            public final String LLILLL = "";

            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_flag_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_2pt_flag;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return true;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return R.string.s65;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "report";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            {
                this.LL = aweme;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                int iIsMeme;
                MemeVideoReg memeVideoReg;
                MemeVideoReg memeVideoReg2;
                int iLJJIII = C0SXF.LJJIII(context, this.LL);
                C735840Sti c735840Sti = C735840Sti.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LL));
                c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(this.LL));
                c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LL)));
                c2344009Gk.LJIIIIZZ("panel_source", this.LLILLL);
                C1359610lU7.LJ(c2344009Gk, this.LL, null);
                Aweme aweme2 = this.LL;
                c735840Sti.getClass();
                C735840Sti.LIZIZ(aweme2, c2344009Gk);
                String string = baseSharePackage.extras.getString("search_id");
                if (string != null) {
                    c2344009Gk.LJFF("search_id", string);
                }
                C1ER1.LIZIZ.LLLF(this.LL, this.LLILLJJLI, c2344009Gk);
                c2344009Gk.LIZJ(this.LL.getIsCommentPostVideo() ? 1 : 0, "is_comment_post_video");
                MemeRegInfo memeRegInfo = this.LL.memeRegInfo;
                int i = 0;
                if (memeRegInfo != null && (memeVideoReg2 = memeRegInfo.memeVideoReg) != null) {
                    iIsMeme = memeVideoReg2.isMeme();
                } else {
                    iIsMeme = 0;
                }
                c2344009Gk.LIZJ(iIsMeme, "is_meme");
                MemeRegInfo memeRegInfo2 = this.LL.memeRegInfo;
                if (memeRegInfo2 != null && (memeVideoReg = memeRegInfo2.memeVideoReg) != null) {
                    i = memeVideoReg.canBoostMeme;
                }
                c2344009Gk.LIZJ(i, "can_boost_meme");
                C20684815ws.LJIILLIIL("report", c2344009Gk.LIZ);
                ShareDependService.LIZ.getClass();
                ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
                Aweme aweme3 = this.LL;
                String str = this.LLILLJJLI;
                shareDependServiceLJJJJI.LJJIZ(aweme3, str, context, "", str, "", "", iLJJIII, null, null);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJ(Aweme aweme, String str) {
        C1372210loR c1372210loR = C1372210loR.LIZ;
        c1372210loR.getClass();
        ShareOperationInfo shareOperationInfo = aweme.getShareOperationInfo();
        c1372210loR.getClass();
        C1372210loR.LIZ(shareOperationInfo);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final EnumC1373410lqN LJIIIZ(String str, String str2) {
        C1375890luN.LIZ.getClass();
        return C1375890luN.LIZLLL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILIIL(Aweme aweme, String str) {
        C1374870lsj.LIZ.getClass();
        if (str == null) {
            str = "";
        }
        if (Intrinsics.LJFF("personal_homepage", str) && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), C1374870lsj.LIZJ.getUid()) && ((C0C64.LJIILLIIL().LJIIIZ(31744, "show_creator_popup_after_publish", true, false) || !C1374870lsj.LIZLLL(Keva.getRepo("repo_guide_share").getLong("last_publish_success_time", 0L))) && !C1374870lsj.LIZIZ)) {
            if (C1374870lsj.LIZIZ().getLong("last_guide_share_window_show_time", 0L) == C1374870lsj.LIZIZ().getLong("last_guide_share_window_click_share_time", 0L)) {
                if (!C1374870lsj.LIZLLL(C1374870lsj.LIZIZ().getLong("last_guide_share_window_show_time", 0L))) {
                    return true;
                }
            } else {
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 5, "creator_popup_internal_delay", true);
                Date date = new Date(C1374870lsj.LIZIZ().getLong("last_guide_share_window_show_time", 0L));
                Date date2 = new Date(System.currentTimeMillis());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                int i3 = calendar.get(5);
                calendar.clear();
                calendar.set(i, i2, i3);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date2);
                int i4 = calendar2.get(1);
                int i5 = calendar2.get(2);
                int i6 = calendar2.get(5);
                calendar2.clear();
                calendar2.set(i4, i5, i6);
                if ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000) >= iLJIJ) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIILL(Activity activity, Function1<? super Pair<? extends InterfaceC1369790lkX, ? extends Drawable>, Unit> function1) throws Throwable {
        C1374860lsi c1374860lsiLIZJ = C1374860lsi.LIZJ();
        c1374860lsiLIZJ.getClass();
        String strLIZJ = C733420Spo.LIZJ();
        C352000Dr4 c352000Dr4 = C352000Dr4.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Util] last share type: ");
        sbLIZ.append(strLIZJ);
        c352000Dr4.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if ("more".equalsIgnoreCase(strLIZJ)) {
            strLIZJ = "";
        }
        if ("copy".equalsIgnoreCase(strLIZJ)) {
            CopyLinkChannel copyLinkChannel = new CopyLinkChannel();
            function1.invoke(new Pair(copyLinkChannel, copyLinkChannel.LJJII(activity, false)));
            return;
        }
        InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1371710lnd.LIZ(activity, strLIZJ);
        if (interfaceC1369790lkXLIZ != null && interfaceC1369790lkXLIZ.LJIIZILJ(activity)) {
            function1.invoke(new Pair(interfaceC1369790lkXLIZ, interfaceC1369790lkXLIZ.LJJII(activity, false)));
        } else {
            c1374860lsiLIZJ.LIZLLL(new AObjectS195S0300000_21(function1, interfaceC1369790lkXLIZ, activity, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIJJLI(Fragment fragment, C737030Svd c737030Svd) {
        C1379160lze.LIZ.getClass();
        int i = c737030Svd.LIZ;
        if (i != 1) {
            if (i != 55) {
                if (i == 56) {
                    final Aweme aweme = (Aweme) c737030Svd.LIZIZ;
                    C19EG c19egRequireActivity = fragment.requireActivity();
                    String str = c737030Svd.LJIIL;
                    String str2 = c737030Svd.LJIIJ;
                    ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIII(c19egRequireActivity, aweme, new InterfaceC1167780gUi() { // from class: X.0ltC
                        @Override // X.InterfaceC1167780gUi
                        public final void LIZIZ(boolean z) {
                        }

                        @Override // X.InterfaceC1167780gUi
                        public final void LIZ(boolean z) {
                            Aweme aweme2;
                            if (z && (aweme2 = aweme) != null) {
                                aweme2.playlist_info = null;
                            }
                        }
                    }, str, str2);
                    return;
                }
                return;
            }
            final Aweme aweme2 = (Aweme) c737030Svd.LIZIZ;
            final C19EG c19egRequireActivity2 = fragment.requireActivity();
            final String str3 = c737030Svd.LJIIL;
            final String str4 = c737030Svd.LJIIJ;
            ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJZLJL(new InterfaceC1167830gUn() { // from class: X.0SRd
                @Override // X.InterfaceC1167830gUn
                public final void LIZ(int i2, boolean z) {
                    if (z) {
                        if (i2 == 0) {
                            Bundle bundle = new Bundle();
                            C786410Ut5.LJJIZ(bundle, "key_mix_add_aweme_info", aweme2);
                            ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJIIJ(c19egRequireActivity2, bundle, 3, str3, str4);
                            return;
                        }
                        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJIJJLI(c19egRequireActivity2, aweme2, "", "", str3, str4);
                        return;
                    }
                    C1233040iBy c1233040iBy = new C1233040iBy(c19egRequireActivity2);
                    c1233040iBy.LIZIZ(R.string.m25);
                    c1233040iBy.LIZLLL();
                }
            });
            return;
        }
        if (!C036E.LIZ.LIZIZ()) {
            C19EG activity = fragment.getActivity();
            if (activity == null) {
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            return;
        }
        Aweme aweme3 = (Aweme) c737030Svd.LIZIZ;
        C19EG activity2 = fragment.getActivity();
        if (activity2 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
        String str5 = c737030Svd.LJIIL;
        shareDependServiceLJJJJI.LJJIZ(aweme3, str5, activity2, "", str5, "", "", 0, null, null);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIIZ(C1371600lnS c1371600lnS, boolean z) {
        BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
        if (baseSharePackage != null) {
            C1369770lkV.LJIIIIZZ(baseSharePackage);
            if (z) {
                C1369770lkV.LJII(baseSharePackage);
            }
            C1369770lkV.LIZ(baseSharePackage);
            C1369770lkV.LIZLLL(baseSharePackage);
            C1369770lkV.LIZJ(baseSharePackage);
        }
        C1369770lkV.LIZIZ(c1371600lnS);
        C1369770lkV.LJFF(c1371600lnS);
        C1369770lkV.LJI(c1371600lnS);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJL(C19EG c19eg, C0SU5 c0su5) {
        C1376290lv1.LIZ(c19eg, c0su5);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJI(ShareOperationInfo shareOperationInfo, boolean z) {
        C1372210loR.LIZ.getClass();
        C1372210loR.LIZ(shareOperationInfo);
        C1372210loR.LIZLLL(shareOperationInfo, z);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJIZL(String str, Aweme aweme) {
        int showType;
        int transcode;
        if (C297600BlW.LIZ()) {
            Video video = aweme.getVideo();
            if (video == null || video.getDownloadNoWatermarkAddr() == null) {
                ACLCommonShare aCLCommonShareLIZIZ = C1373290lqB.LIZIZ("save", "long_press", aweme.awemeACLShareInfo);
                C1374940lsq c1374940lsq = C1374940lsq.LIZ;
                if (aCLCommonShareLIZIZ != null) {
                    showType = aCLCommonShareLIZIZ.getShowType();
                    transcode = aCLCommonShareLIZIZ.getTranscode();
                } else {
                    showType = 0;
                    transcode = -1;
                }
                c1374940lsq.getClass();
                C1374940lsq.LIZ(showType, transcode, aweme, "show", "long_press_download", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJJJJJL(int i, String str) {
        C1375890luN.LIZ.getClass();
        if (C1357680lR0.LIZ(i)) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJJJLZIJ(Activity activity, String str) {
        InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ(str, activity, null, 4);
        if (interfaceC1369790lkXLIZ == null) {
            return null;
        }
        return interfaceC1369790lkXLIZ.LJJII(activity, false);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJZ(Context context, Aweme aweme) {
        return C1387490mD5.LIZ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJILLIZJL(InterfaceC1369790lkX interfaceC1369790lkX, C1371600lnS c1371600lnS) {
        C1374660lsO.LIZ.getClass();
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "contact_list") && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        c1371600lnS.LIZIZ(interfaceC1369790lkX);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJLIIIJJIZ(final C19EG c19eg, final C1445970njP c1445970njP) {
        boolean z;
        String str;
        int size;
        List listLIZ;
        C1380390m1d c1380390m1d;
        final EnumC1377930lxf enumC1377930lxf;
        String str2;
        List<String> urlList;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        boolean z2 = C1375000lsw.LIZ;
        List<ShareChannelSettings> silentShareList = C0CLW.LIZIZ.LIZ.getSilentShareList();
        if (silentShareList != null && !silentShareList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            EnumC1377930lxf.Companion.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            C20684815ws.LJIILLIIL("silent_share_default_list", c2344009Gk.LIZ);
        } else {
            EnumC1377930lxf.Companion.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            C20684815ws.LJIILLIIL("silent_share_default_list", c2344009Gk2.LIZ);
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) c1445970njP.LJII;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        if (aVUploadSaveModel != null) {
            final Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null && aweme.getDistributeType() != 1) {
                str = "long";
            } else {
                str = "short";
            }
            boolean zIsWaterMark = aVUploadSaveModel.isWaterMark();
            C1373850lr5.LIZ.getClass();
            if (aweme.getAwemeType() == 150 && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            if (!C1375000lsw.LIZIZ && aVUploadSaveModel.getSaveToAlbum()) {
                C1357300lQO.LIZIZ(aweme, "video_post_page", "download", str, null, zIsWaterMark ? 1 : 0, size);
            }
            int saveType = aVUploadSaveModel.getSaveType();
            if (!C0CLT.LIZ()) {
                listLIZ = C1697810uHb.LJIIJJI(EnumC1377930lxf.LINE, EnumC1377930lxf.MESSENGER);
            } else {
                EnumC1377930lxf.Companion.getClass();
                listLIZ = C1377920lxe.LIZ(c19eg);
            }
            Iterator it2 = listLIZ.iterator();
            do {
                c1380390m1d = null;
                if (it2.hasNext()) {
                    enumC1377930lxf = (EnumC1377930lxf) it2.next();
                } else {
                    C1375000lsw.LIZIZ = true;
                    return false;
                }
            } while (enumC1377930lxf.getSaveType() != saveType);
            UrlModel urlModelLIZIZ = C1375340ltU.LIZIZ(createAwemeResponse);
            if (urlModelLIZIZ != null && (urlList = urlModelLIZIZ.getUrlList()) != null) {
                str2 = (String) ListProtector.get(urlList, 0);
            } else {
                str2 = null;
            }
            C1324840ka2.LJIJJ(str2);
            if (urlModelLIZIZ != null) {
                C1375350ltV c1375350ltV = new C1375350ltV(c19eg, aweme, enumC1377930lxf.getLabel(), urlModelLIZIZ);
                c1375350ltV.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0lsg
                    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
                    @Override // android.widget.PopupWindow.OnDismissListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onDismiss() {
                        /*
                            Method dump skipped, instruction units count: 361
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1374840lsg.onDismiss():void");
                    }
                });
                C1380390m1d c1380390m1d2 = c1375350ltV.LLILLJJLI;
                if (c1380390m1d2 == null) {
                    c1380390m1d2 = null;
                }
                c1380390m1d2.LIZIZ();
                if (!c1375350ltV.isShowing()) {
                    if (c1375350ltV.getContentView().getParent() != null) {
                        C786410Ut5.LJJJLZIJ(c1375350ltV.getContentView(), (ViewGroup) c1375350ltV.getContentView().getParent());
                    }
                    C1380390m1d c1380390m1d3 = c1375350ltV.LLILLJJLI;
                    if (c1380390m1d3 != null) {
                        c1380390m1d = c1380390m1d3;
                    }
                    HandlerHook.viewPostDelay(c1380390m1d, new ARunnableS121S0100000_21(c1375350ltV, 148), 3000L);
                    c1375350ltV.showAtLocation(c1375350ltV.LL.getWindow().getDecorView(), 48, 0, 0);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(c1375350ltV);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                }
            }
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("enter_from", "video_post_page");
            c2344009Gk3.LJIIIIZZ("platform", enumC1377930lxf.getKey());
            C20684815ws.LJIILLIIL("share_notice_after_post", c2344009Gk3.LIZ);
            if (!C1375000lsw.LIZIZ) {
                C1357300lQO.LIZIZ(aweme, "video_post_page", enumC1377930lxf.getKey(), str, null, zIsWaterMark ? 1 : 0, 1);
                C1375000lsw.LIZIZ = true;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1372180loO LJJLL(BaseSharePackage baseSharePackage, EnumC1371620lnU enumC1371620lnU) {
        return new C1372180loO(baseSharePackage.itemType, 8);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIIZILJ(Context context, Aweme aweme, String str) {
        C1375740lu8.LIZ.getClass();
        return C1375740lu8.LIZ(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final int LJJII(int i, String str, String str2) {
        C1375890luN.LIZ.getClass();
        if (TextUtils.equals("web", str)) {
            if (i <= 10000) {
                return EnumC1373410lqN.SHARE_JSB_WEB.getNum();
            }
            return i;
        }
        return C1375890luN.LIZLLL(str, str2).getNum();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIL(String str, String str2, Aweme aweme) {
        C1374870lsj.LIZ.getClass();
        C1374870lsj.LJ("publish_then_share", str, str2, aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJJ(Bundle bundle, Aweme aweme, String str) {
        JSONObject jSONObject = C1379930m0t.LIZ;
        C1379920m0s.LIZ(bundle, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLI(int i, String str, String str2) {
        C1374860lsi.LIZJ().LIZ(i, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C737310Sw5 LJJLIIIJLJLI(Aweme aweme, String str, String str2) {
        if (str == null) {
            str = "";
        }
        return new C737310Sw5(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1375400lta LJJZZIII(String str, InterfaceC1370310llN interfaceC1370310llN, Context context) {
        C1381070m2j c1381070m2j;
        int i;
        int iHashCode = str.hashCode();
        C1375400lta c1375400lta = null;
        if (iHashCode != -1143884687) {
            if (iHashCode != -50093235) {
                if (iHashCode == 1210380575 && str.equals("live_photo")) {
                    return new C1375400lta(R.raw.icon_live_wallpaper, 2131858420, str);
                }
            } else if (str.equals("captions")) {
                if ((interfaceC1370310llN instanceof C1381070m2j) && (c1381070m2j = (C1381070m2j) interfaceC1370310llN) != null) {
                    C20703515zt.LIZ.getClass();
                    if ((!C746760TRa.LIZ().LJJIIJ()) || (C0SXF.LJIL(context) && C746760TRa.LIZ().LJFF())) {
                        i = R.raw.icon_closed_captions;
                    } else {
                        i = R.raw.icon_closed_captions_slash;
                    }
                    c1375400lta = new C1375400lta(i, c1381070m2j.LJJLIIIJJIZ(), str);
                }
                return c1375400lta;
            }
        } else if (str.equals("why_this_video")) {
            return new C1375400lta(R.raw.icon_question_mark_circle_ltr, 2131858532, str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJI(String str, Integer num, C1260870iur<?, ?> c1260870iur, Pair<Integer, String> pair) {
        C1374950lsr.LIZ(str, num, c1260870iur, pair);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJL(Context context, final Activity activity, final C1376210lut c1376210lut, final AwS635S0100000_21 awS635S0100000_21) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        Integer numLIZ;
        ACLCommonShare downloadMaskPanel;
        ACLCommonShare downloadMaskPanel2;
        Aweme aweme = c1376210lut.LJ;
        String popupMsg = null;
        if (Intrinsics.LJFF(C1379220lzk.LIZ, "long_press_download")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null && (downloadMaskPanel2 = awemeACLShare.getDownloadMaskPanel()) != null) {
                popupMsg = downloadMaskPanel2.getPopupMsg();
            }
        } else {
            AwemeACLShare awemeACLShare2 = aweme.awemeACLShareInfo;
            if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null) {
                popupMsg = downloadGeneral.getPopupMsg();
            }
        }
        final Aweme aweme2 = c1376210lut.LJ;
        final String str = c1376210lut.LIZ;
        final String str2 = c1376210lut.LIZIZ;
        if (popupMsg != null && popupMsg.length() != 0) {
            C1377040lwE c1377040lwE = C1377040lwE.LIZ;
            Integer numLIZ2 = C1374980lsu.LIZ(aweme2);
            InterfaceC1377050lwF interfaceC1377050lwF = new InterfaceC1377050lwF() { // from class: X.0ZQl
                @Override // X.InterfaceC1377050lwF
                public final void LIZ() {
                    C856800XjK.LIZ(aweme2.getAid(), AwemeExtKt.getAuthorUid(aweme2), str, str2, "cancel");
                }

                @Override // X.InterfaceC1377050lwF
                public final void LIZIZ() {
                    awS635S0100000_21.invoke(activity, c1376210lut);
                    C856800XjK.LIZ(aweme2.getAid(), AwemeExtKt.getAuthorUid(aweme2), str, str2, "download");
                }
            };
            c1377040lwE.getClass();
            C1377040lwE.LIZ(context, popupMsg, numLIZ2, interfaceC1377050lwF, true);
        } else if (Intrinsics.LJFF(C1379220lzk.LIZ, "long_press_download")) {
            AwemeACLShare awemeACLShare3 = aweme.awemeACLShareInfo;
            if (awemeACLShare3 != null && (downloadMaskPanel = awemeACLShare3.getDownloadMaskPanel()) != null) {
                toastMsg = downloadMaskPanel.getToastMsg();
                if (toastMsg != null && toastMsg.length() > 0) {
                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                    c1233040iBy.LIZJ(toastMsg);
                    c1233040iBy.LIZLLL();
                }
            }
            numLIZ = C1374980lsu.LIZ(aweme);
            if (numLIZ == null && numLIZ.intValue() == 0) {
                return true;
            }
        } else {
            AwemeACLShare awemeACLShare4 = aweme.awemeACLShareInfo;
            if (awemeACLShare4 != null && (downloadGeneral2 = awemeACLShare4.getDownloadGeneral()) != null) {
                toastMsg = downloadGeneral2.getToastMsg();
                if (toastMsg != null) {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(activity);
                    c1233040iBy2.LIZJ(toastMsg);
                    c1233040iBy2.LIZLLL();
                }
            }
            numLIZ = C1374980lsu.LIZ(aweme);
            if (numLIZ == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL(com.ss.android.ugc.aweme.feed.model.Aweme r20, X.C19EG r21, java.lang.String r22, kotlin.jvm.functions.Function1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareExtServiceImpl.LJJLIL(com.ss.android.ugc.aweme.feed.model.Aweme, X.19EG, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLJLI(Aweme aweme, String str, int i, int i2) {
        C1357300lQO.LIZIZ(aweme, str, "download", "short", null, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1376170lup LJIJ(Activity activity, Aweme aweme, String str, String str2, String str3) {
        String str4 = str;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str3 != null) {
            str5 = str3;
        }
        return new C1376170lup(activity, aweme, str4, str2, str5, 32);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIJJ(Aweme aweme, Activity activity, String str, String str2, int i) {
        new Object() { // from class: X.0ltf
        }.getClass();
        if (aweme != null && activity != null) {
            C1375440lte c1375440lte = new Object() { // from class: X.0lte
            };
            String groupId = aweme.getGroupId();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            Integer numValueOf = Integer.valueOf(i);
            c1375440lte.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            String strLIZ = "";
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("to_user_id", str);
            if (groupId == null) {
                groupId = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", groupId);
            if (authorUid == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 4) {
                    strLIZ = "collect";
                } else {
                    strLIZ = C1259870itF.LIZ(numValueOf.intValue());
                }
            }
            c2344009Gk.LJIIIIZZ("tab_name", strLIZ);
            C20684815ws.LJIILLIIL("shortcut_click_trans_layer", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lt8] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C1375120lt8 LJJIIJ(Challenge challenge, boolean z, String str, String str2, String str3) {
        return new C1209570ha7(challenge, str, str2, str3) { // from class: X.0lt8
            public final Challenge LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;
            public final String LLILZIL;

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                int i;
                long userCount;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("tag_id", this.LLILLJJLI.getCid());
                c2344009Gk.LJIIIIZZ("platform", "scan");
                c2344009Gk.LJIIIIZZ("qr_code_type", "shaped");
                c2344009Gk.LJIIIIZZ("enter_from", "challenge");
                C20684815ws.LJIILLIIL("click_qr_code", c2344009Gk.LIZ);
                if (((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIJJ(this.LLILLJJLI)) {
                    i = 23;
                } else {
                    i = 2;
                }
                Bundle bundle = new Bundle();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(this.LLILLJJLI.getChallengeName());
                C786410Ut5.LJJJI("display_name", C2188811AlT.LIZIZ(sbLIZ), bundle);
                Long lValueOf = Long.valueOf(this.LLILLJJLI.getUseCount());
                if (lValueOf.longValue() > -1) {
                    userCount = lValueOf.longValue();
                } else {
                    userCount = this.LLILLJJLI.getUserCount();
                }
                bundle.putLong("display_count", userCount);
                C786410Ut5.LJJJI("enter_from", "hash_tag", bundle);
                String string = baseSharePackage.extras.getString("enter_from");
                String string2 = baseSharePackage.extras.getString("enter_method");
                C1372790lpN c1372790lpN = new C1372790lpN(i, this.LLILLJJLI.getCid(), bundle);
                Activity activityLJII = C1375500ltk.LJII(context);
                if (activityLJII != null) {
                    C621180OYa.LIZ.LJIIJ(activityLJII, baseSharePackage.itemType, c1372790lpN, string, string2);
                }
                MobClick mobClick = new MobClick();
                mobClick.setEventName("share_challenge");
                mobClick.setLabelName("qr_code");
                mobClick.setExtValueString(this.LLILLJJLI.getCid());
                C736480Suk c736480Suk = new C736480Suk();
                c736480Suk.LIZ("request_id", this.LLILZ);
                c736480Suk.LIZ("challenge_id", this.LLILLL);
                c736480Suk.LIZ("process_id", this.LLILZIL);
                mobClick.setJsonObject(c736480Suk.LIZIZ());
                C20684815ws.onEvent(mobClick);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("tag_id", this.LLILLL);
                c2344009Gk2.LJIIIIZZ("platform", "qr_code");
                c2344009Gk2.LJIIIIZZ("share_mode", "normal_share");
                c2344009Gk2.LJIIIIZZ("process_id", this.LLILZIL);
                C20684815ws.LJIILLIIL("share_tag", c2344009Gk2.LIZ);
            }

            {
                this.LLILLJJLI = challenge;
                this.LLILLL = str;
                this.LLILZ = str2;
                this.LLILZIL = str3;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final InterfaceC1370310llN LJJLIIIIJ(Activity activity, final Aweme aweme, String str, final String str2, final String str3, String str4) {
        ACLCommonShare downloadGeneral;
        if (Intrinsics.LJFF(str, "live_photo")) {
            if (C1373290lqB.LIZ("live_photo", str4, aweme.awemeACLShareInfo) && !C10EU.LJIIIIZZ() && !Intrinsics.LJFF(str3, "homepage_podcast")) {
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJIIJJI(aweme, str3);
                AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
                if ((awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 0) && ShareDependServiceImpl.LJJJJI().LIZJ(aweme)) {
                    return C1373290lqB.LIZJ(new InterfaceC1370310llN(aweme, str3, str2) { // from class: X.0lsn
                        public static final /* synthetic */ int LLILLL = 0;
                        public final Aweme LL;
                        public final String LLILLJJLI;

                        @Override // X.InterfaceC1370310llN
                        public final float LIZLLL() {
                            return -1.0f;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJI() {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJII() {
                            return R.raw.icon_live_wallpaper_fill;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIIIZZ() {
                            return R.raw.icon_live_wallpaper;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJIIIZ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJIILJJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIJJLI() {
                            return 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJIJ(ImageView imageView, View view, int i) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJIJIIJIL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJIL() {
                            return true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String LJJIZ() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJI(BaseSharePackage baseSharePackage) {
                        }

                        @Override // X.InterfaceC1370310llN
                        public final Integer LJJJJIZL() {
                            return null;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJJL() {
                            return true;
                        }

                        @Override // X.InterfaceC1370450llb
                        public final int LJJJJLI() {
                            return 100;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJJLZIJ() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJLIIIJJIZ() {
                            return 2131858420;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean LJJLIIIJL() {
                            return false;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String key() {
                            return "live_photo";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final String label() {
                            return "";
                        }

                        @Override // X.InterfaceC1370310llN
                        public final boolean enable() {
                            AwemeACLShare awemeACLShare2;
                            ACLCommonShare downloadGeneral2;
                            C2413209cw.LIZ.getClass();
                            IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
                            return (iWallpaperServiceApiLIZ == null || iWallpaperServiceApiLIZ.LJIIJJI() || (awemeACLShare2 = this.LL.awemeACLShareInfo) == null || (downloadGeneral2 = awemeACLShare2.getDownloadGeneral()) == null || downloadGeneral2.getShowType() != 2 || iWallpaperServiceApiLIZ == null || !iWallpaperServiceApiLIZ.LIZIZ()) ? false : true;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJIIJJI() {
                            return !enable() ? 1 : 0;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final C0M7Z LJIIJ() {
                            return C0M7Z.ShareButton;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final EnumC1216710hld LJJJZ() {
                            return EnumC1216710hld.NORMAL;
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIJJ(TextView textView) {
                            C1370320llO.LJ(this, textView);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                            return C1370320llO.LIZJ(enumC1369720lkQ);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                            ACLCommonShare downloadGeneral2;
                            ACLCommonShare downloadGeneral3;
                            String toastMsg;
                            C2413209cw.LIZ.getClass();
                            IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
                            if (iWallpaperServiceApiLIZ != null) {
                                if (!iWallpaperServiceApiLIZ.LJIIJJI() && iWallpaperServiceApiLIZ.LIZIZ()) {
                                    AwemeACLShare awemeACLShare2 = this.LL.awemeACLShareInfo;
                                    if (awemeACLShare2 != null && (downloadGeneral3 = awemeACLShare2.getDownloadGeneral()) != null && (toastMsg = downloadGeneral3.getToastMsg()) != null && toastMsg.length() != 0) {
                                        C1233040iBy c1233040iBy = new C1233040iBy(context);
                                        c1233040iBy.LIZJ(toastMsg);
                                        c1233040iBy.LIZLLL();
                                    }
                                    AwemeACLShare awemeACLShare3 = this.LL.awemeACLShareInfo;
                                    if (awemeACLShare3 != null && (downloadGeneral2 = awemeACLShare3.getDownloadGeneral()) != null && downloadGeneral2.getCode() == 0) {
                                        String string = baseSharePackage.extras.getString("previousPage");
                                        if (string == null) {
                                            string = "";
                                        }
                                        Activity activityLJII = C1375500ltk.LJII(context);
                                        if (activityLJII != null) {
                                            IWallpaperServiceApi iWallpaperServiceApiLIZ2 = C2413209cw.LIZ();
                                            if (iWallpaperServiceApiLIZ2 != null) {
                                                iWallpaperServiceApiLIZ2.LJII(activityLJII, this.LL, this.LLILLJJLI, string);
                                            }
                                            ShareDependService.LIZ.getClass();
                                            ShareDependServiceImpl.LJJJJI().LJJ(this.LL, activityLJII);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                C844470XAv.LIZ.getClass();
                                iWallpaperServiceApiLIZ.LJIIJ(C844470XAv.LIZ());
                            }
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZIZ(this, view, baseSharePackage);
                        }

                        @Override // X.InterfaceC1370310llN
                        public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                            C1370320llO.LIZLLL(context, baseSharePackage, this);
                        }

                        {
                            this.LL = aweme;
                            this.LLILLJJLI = str2;
                        }
                    }, str4, aweme.awemeACLShareInfo);
                }
            }
            return null;
        }
        if (!Intrinsics.LJFF(str, "captions")) {
            return null;
        }
        return C1376680lve.LIZ(activity, str3, aweme, str4);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final FrameLayout.LayoutParams LJJJJZ(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        Number numberValueOf;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.height = i2;
        layoutParams.width = i3;
        int fullScreenHeight = ((ScreenUtils.getFullScreenHeight(context) - i) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context)) - i2;
        if (i6 == 2) {
            numberValueOf = Integer.valueOf(fullScreenHeight + i5);
        } else {
            numberValueOf = Double.valueOf((((double) fullScreenHeight) * 0.5d) + ((double) i5));
        }
        layoutParams.gravity = 1;
        layoutParams.topMargin = numberValueOf.intValue();
        layoutParams.leftMargin = i4;
        return layoutParams;
    }
}
