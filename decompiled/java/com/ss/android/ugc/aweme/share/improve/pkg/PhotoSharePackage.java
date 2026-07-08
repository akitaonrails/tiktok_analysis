package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C01GW;
import X.C1075650e67;
import X.C1324840ka2;
import X.C1355680lNm;
import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1373320lqE;
import X.C1373340lqG;
import X.C1373350lqH;
import X.C1373390lqL;
import X.C1373550lqb;
import X.C1373950lrF;
import X.C1374050lrP;
import X.C1374320lrq;
import X.C1374800lsc;
import X.C1375500ltk;
import X.C1376010luZ;
import X.C1376330lv5;
import X.C1377070lwH;
import X.C13LE;
import X.C1697810uHb;
import X.C18ZU;
import X.C2217371BqR;
import X.C452501pT;
import X.C621180OYa;
import X.C717590SCv;
import X.C786410Ut5;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import X.InterfaceC1378050lxr;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class PhotoSharePackage extends LinkDefaultSharePackage {
    public static final int $stable;
    public static final C1373390lqL Companion;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public static final ArrayList<String> doNotRecordChannels;
    public final C717590SCv activity$delegate;
    public C1373320lqE params;
    public final C01GW shareListener$delegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lqL] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(PhotoSharePackage.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217371BqR};
        Companion = new Object() { // from class: X.0lqL
        };
        $stable = 8;
        doNotRecordChannels = C1697810uHb.LJ("download", "copy");
    }

    public abstract void LJJ(C1371600lnS c1371600lnS);

    public final Activity LJJI() {
        C717590SCv c717590SCv = this.activity$delegate;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
        return (Activity) c717590SCv.LIZ();
    }

    public final C1371590lnR LJJIFFI() {
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJJIIJ = this;
        ShareDependService.LIZ.getClass();
        C1075650e67.LIZ(ShareDependServiceImpl.LJJJJI().LJJJIL(this, ""), c1371600lnS);
        c1371600lnS.LIZIZ(new CopyLinkChannel(false));
        C1377070lwH c1377070lwH = new C1377070lwH(new InterfaceC1378050lxr() { // from class: X.0lqK
            @Override // X.InterfaceC1378050lxr
            public final Activity get() {
                return this.LIZ.LJJI();
            }
        }, AFwS259S0000000_21.get$arr$(222));
        C1374800lsc.LIZ.getClass();
        C1374800lsc.LIZ("whatsapp_status", c1377070lwH, c1371600lnS);
        C621180OYa.LIZ.LJIILIIL(LJJI(), c1371600lnS, false, false);
        c1371600lnS.LJIIZILJ = true;
        c1371600lnS.LJJIIJZLJL = true;
        c1371600lnS.LJJI = R.string.tba;
        c1371600lnS.LJJIII = R.string.f1_;
        c1371600lnS.LJJJJJL = false;
        c1371600lnS.LJJIL = (InterfaceC1366490lfD) this.shareListener$delegate.getValue();
        LJJ(c1371600lnS);
        if (c1371600lnS.LJJIIJZLJL) {
            c1371600lnS.LJJJI = true;
        }
        if (!this.params.LJIILL) {
            c1371600lnS.LJJJJI = true;
        }
        return new C1371590lnR(c1371600lnS);
    }

    public PhotoSharePackage(Activity activity, C1373320lqE c1373320lqE) {
        ActionLinkType actionLinkType;
        String str;
        Companion.getClass();
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = c1373320lqE.LIZ;
        c1370940lmO.LIZIZ = c1373320lqE.LIZJ;
        c1370940lmO.LJFF = c1373320lqE.LJIIIIZZ;
        String str2 = c1373320lqE.LJIILLIIL;
        c1370940lmO.LIZLLL = str2 == null ? activity.getString(2131838434) : str2;
        String str3 = c1373320lqE.LJIIZILJ;
        c1370940lmO.LJ = str3 == null ? activity.getString(2131838433) : str3;
        ImageComponent.Companion.getClass();
        ImageComponent imageComponentLIZ = C18ZU.LIZ();
        UrlModel urlModel = c1373320lqE.LJI;
        imageComponentLIZ = urlModel != null ? new ImageComponent(urlModel.getUrlList(), urlModel.getUri(), (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 60) : imageComponentLIZ;
        C1373350lqH c1373350lqHLIZ = C1373340lqG.LIZ(new AwS387S0200000_21(c1373320lqE, c1373320lqE, 36));
        ImageCardTitleBar imageCardTitleBar = new ImageCardTitleBar(imageComponentLIZ, new TextComponent(c1373320lqE.LJIIJ.LIZ, null, null), new TextComponent(c1373320lqE.LJIIJJI.LIZ, null, null), 8);
        List listSingletonList = Collections.singletonList(c1373320lqE.LJIIIZ);
        if (c1373320lqE.LJIJJ == 1) {
            actionLinkType = ActionLinkType.H5_LINK;
        } else {
            actionLinkType = ActionLinkType.DEEP_LINK;
        }
        ImageCardTemplate imageCardTemplate = new ImageCardTemplate(imageCardTitleBar, new ActionLinkComponent(listSingletonList, actionLinkType), null, new PreviewHintComponent(new TextComponent(c1373320lqE.LJIIL.LIZ, null, null), new TextComponent(c1373320lqE.LJIILIIL.LIZ, null, null), new TextComponent(c1373320lqE.LJIILJJIL.LIZ, null, null), null, null, null, 56), new BaseRequestComponent(new QueryDataComponent(c1373320lqE.LIZJ, c1373350lqHLIZ.LIZLLL())), 468);
        if (!Intrinsics.LJFF(c1373320lqE.LIZ, "now_video") && !Intrinsics.LJFF(c1373320lqE.LIZ, "now_video_memory") && !Intrinsics.LJFF(c1373320lqE.LIZ, "now_post_memory") && !Intrinsics.LJFF(c1373320lqE.LIZ, "now_others_post") && !Intrinsics.LJFF(c1373320lqE.LIZ, "now_others_video_post")) {
            str = c1373320lqE.LIZ;
        } else {
            str = "now_post";
        }
        c1370940lmO.LJIIIIZZ = new SendMessageTemplateTask(str, imageCardTemplate, new SendMessageEventParcel(c1373320lqE.LIZLLL, null, null, null, null, null, 62), null, false, 24);
        super(c1370940lmO);
        this.params = c1373320lqE;
        this.activity$delegate = new C717590SCv(new AwS565S0100000_21(activity, 822));
        Bundle bundle = this.extras;
        C786410Ut5.LJJJI("enter_from", this.params.LIZLLL, bundle);
        C786410Ut5.LJJJI("enter_method", this.params.LJ, bundle);
        C786410Ut5.LJJJI("panel_source", this.params.LJFF, bundle);
        C1355680lNm.LIZIZ(bundle, this.params.LJFF);
        C1355680lNm.LIZJ(bundle, this.params.LIZIZ);
        Activity activityLJJI = LJJI();
        C786410Ut5.LJJJI("app_name", activityLJJI != null ? activityLJJI.getString(R.string.drg) : null, bundle);
        C786410Ut5.LJJJI("thumb_url", C1324840ka2.LJIILLIIL(this.params.LJI), bundle);
        C786410Ut5.LJJIZ(bundle, "thumb_for_share", this.params.LJI);
        C786410Ut5.LJJIZ(bundle, "cover_thumb", this.params.LJI);
        this.shareListener$delegate = C452501pT.LIZIZ(new AwS565S0100000_21(this, 823));
    }

    public boolean LJJII(final InterfaceC1369790lkX interfaceC1369790lkX, final Context context, final Aweme aweme, final int i, boolean z) {
        List<String> urlList;
        String str;
        if (z) {
            C1373550lqb c1373550lqb = C1373550lqb.LIZ;
            String string = this.extras.getString("download_share_path");
            c1373550lqb.getClass();
            C1373550lqb.LJ(interfaceC1369790lkX, string, context, this, i);
            return true;
        }
        UrlModel urlModel = this.params.LJII;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty()) && (str = (String) ListProtector.get(urlList, 0)) != null) {
            C786410Ut5.LJJJI("download_method", "download_to_share", this.extras);
            C1373550lqb.LIZ.getClass();
            final Activity activityLJII = C1375500ltk.LJII(context);
            if (activityLJII != null) {
                int i2 = this.extras.getInt("page_type");
                C1373950lrF c1373950lrF = new C1373950lrF(activityLJII, aweme, this, interfaceC1369790lkX, context, i) { // from class: X.0lrE
                    public final /* synthetic */ Aweme LJ;
                    public final /* synthetic */ SharePackage LJFF;
                    public final /* synthetic */ InterfaceC1369790lkX LJI;
                    public final /* synthetic */ Context LJII;
                    public final /* synthetic */ int LJIIIIZZ;

                    @Override // X.AbstractC1375080lt4
                    public final void LIZJ(String str2) {
                        String string2;
                        Bundle bundle;
                        Aweme aweme2 = this.LJ;
                        if (aweme2 != null) {
                            SharePackage sharePackage = this.LJFF;
                            Bundle bundle2 = new Bundle();
                            C1373930lrD.LIZ.getClass();
                            C1373930lrD.LIZ(bundle2, sharePackage);
                            C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                            if (sharePackage == null || (bundle = sharePackage.extras) == null || (string2 = bundle.getString("enter_from")) == null) {
                                string2 = "";
                            }
                            c1375670lu1.getClass();
                            C1375670lu1.LIZIZ(0, 1, 0, aweme2, string2, "normal_photo");
                        }
                    }

                    @Override // X.C1373950lrF, X.AbstractC1375080lt4
                    public final void LJ(DownloadInfo downloadInfo) {
                        String string2;
                        Bundle bundle;
                        super.LJ(downloadInfo);
                        Aweme aweme2 = this.LJ;
                        if (aweme2 != null) {
                            SharePackage sharePackage = this.LJFF;
                            Bundle bundle2 = new Bundle();
                            C1373930lrD.LIZ.getClass();
                            C1373930lrD.LIZ(bundle2, sharePackage);
                            if (sharePackage == null || (bundle = sharePackage.extras) == null || (string2 = bundle.getString("enter_from")) == null) {
                                string2 = "";
                            }
                            C1376320lv4.LIZJ(aweme2, string2, "download_to_share", "", "", bundle2);
                        }
                    }

                    @Override // X.C1373950lrF, X.AbstractC1375080lt4
                    public final void LJFF(String str2, String str3, boolean z2) {
                        String string2;
                        Bundle bundle;
                        super.LJFF(str2, str3, z2);
                        if (str2 != null) {
                            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LJI;
                            Context context2 = this.LJII;
                            SharePackage sharePackage = this.LJFF;
                            int i3 = this.LJIIIIZZ;
                            Aweme aweme2 = this.LJ;
                            C1373550lqb.LIZ.getClass();
                            C1373550lqb.LJ(interfaceC1369790lkX2, str2, context2, sharePackage, i3);
                            if (aweme2 != null) {
                                Bundle bundle2 = new Bundle();
                                C1373930lrD.LIZ.getClass();
                                C1373930lrD.LIZ(bundle2, sharePackage);
                                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                                if (sharePackage == null || (bundle = sharePackage.extras) == null || (string2 = bundle.getString("enter_from")) == null) {
                                    string2 = "";
                                }
                                String strLIZJ = C721220SQu.LIZJ(aweme2, Collections.singleton(0));
                                c1375670lu1.getClass();
                                C1375670lu1.LIZIZ(1, 1, 1, aweme2, string2, strLIZJ);
                            }
                        }
                    }

                    {
                        this.LJ = aweme;
                        this.LJFF = this;
                        this.LJI = interfaceC1369790lkX;
                        this.LJII = context;
                        this.LJIIIIZZ = i;
                    }
                };
                C1374050lrP c1374050lrP = (C1374050lrP) C1373550lqb.LIZIZ.getValue();
                c1374050lrP.LIZIZ = true;
                C1374320lrq c1374320lrqLIZ = c1374050lrP.LIZ();
                C1376330lv5 c1376330lv5 = new C1376330lv5(new WeakReference(activityLJII), Integer.valueOf(i2));
                C1376010luZ.LIZ.getClass();
                C1376010luZ.LIZJ = str;
                C1376010luZ.LJJI = true;
                c1376330lv5.LIZ(str, c1373950lrF, c1374320lrqLIZ, false);
            }
            return true;
        }
        return false;
    }
}
