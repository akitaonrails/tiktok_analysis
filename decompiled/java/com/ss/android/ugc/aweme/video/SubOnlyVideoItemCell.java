package com.ss.android.ugc.aweme.video;

import X.C01GW;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1850730yGF;
import X.C1906070zhV;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C438710HIf;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC492500JTc;
import X.InterfaceC1891350zJl;
import Y.ACListenerS143S0100000_8;
import Y.ACListenerS162S0100000_28;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubscriptionPhotoTextConsumptionKillswitch;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class SubOnlyVideoItemCell extends PowerCell<C1906070zhV> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(409));

    public static boolean L5(Aweme aweme) {
        boolean zLJFF;
        List<PhotoModeImageUrlModel> imageList;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null) {
            zLJFF = Intrinsics.LJFF(cmPreviewInfo.getShouldShowPreview(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.isEmpty()) {
                return false;
            }
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            while (it2.hasNext()) {
                SubscriptionInfo subscriptionInfo = it2.next().subscriptionInfo;
                if (subscriptionInfo == null || !Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.TRUE)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean I5(Aweme aweme) {
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
            return Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        Video video;
        Video video2;
        Video video3;
        UrlModel cover;
        UrlModel cover2;
        List<String> urlList;
        AwemeStatus.ReviewResult reviewResult;
        ContentModel contentModel;
        int i;
        StandardBusinessModel standardBusinessModel;
        int i2;
        UrlModel cover3;
        int i3;
        int i4;
        C1906070zhV c1906070zhV = (C1906070zhV) interfaceC1891350zJl;
        super.onBindItemView(c1906070zhV);
        int i5 = 8;
        C786410Ut5.LLIIL((RelativeLayout) this.itemView.findViewById(R.id.uq_), 8);
        C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.ce3));
        View viewFindViewById = this.itemView.findViewById(R.id.ene);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        Aweme aweme = c1906070zhV.LL;
        if (aweme != null) {
            z = true;
        } else {
            z = false;
        }
        String coverNotice = null;
        if (z) {
            if (aweme != null) {
                View viewFindViewById2 = this.itemView.findViewById(R.id.wg9);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                    C786410Ut5.I7(new ACListenerS162S0100000_28(this, aweme, 77), viewFindViewById2);
                }
                TextView textView = (TextView) this.itemView.findViewById(R.id.viewer_count);
                if (textView != null) {
                    if (SubscriptionPhotoTextConsumptionKillswitch.INSTANCE.isDisabled() && c1906070zhV.LLIZLLLIL == EnumC492500JTc.PRIVILEGE_PAGE) {
                        C786410Ut5.LJLLLLLL(8, textView);
                    } else {
                        AwemeStatistics statistics = aweme.getStatistics();
                        if (statistics != null) {
                            textView.setText(C1850730yGF.LIZJ(statistics.getPlayCount()));
                        }
                    }
                }
                View viewFindViewById3 = this.itemView.findViewById(R.id.qmu);
                if (viewFindViewById3 != null && SubscriptionPhotoTextConsumptionKillswitch.INSTANCE.isDisabled() && c1906070zhV.LLIZLLLIL == EnumC492500JTc.PRIVILEGE_PAGE) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                }
                TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.tki);
                if (tuxIconView != null) {
                    if ((SubscriptionPhotoTextConsumptionKillswitch.INSTANCE.isDisabled() && c1906070zhV.LLIZLLLIL == EnumC492500JTc.PRIVILEGE_PAGE) || !aweme.isSubOnlyVideo()) {
                        i4 = 8;
                    } else {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_star_ring;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        tuxIconView.setTuxIcon(c419910GdJ);
                        i4 = 0;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, i4);
                }
                View viewFindViewById4 = this.itemView.findViewById(R.id.n82);
                if (viewFindViewById4 != null) {
                    if (aweme.getAwemeType() == 150) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i3, viewFindViewById4);
                }
                SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.video_image_hold);
                if (smartImageView != null) {
                    Video video4 = aweme.getVideo();
                    if (video4 != null) {
                        cover3 = video4.getCover();
                    } else {
                        cover3 = null;
                    }
                    N5(smartImageView, cover3, Bitmap.Config.ARGB_8888);
                }
                TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.tv_top);
                if (tuxTag != null) {
                    if (AwemeExtKt.isTop(aweme)) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LLZLLIL(tuxTag, i2);
                }
                Iterator<VideoMaskInfo> it2 = aweme.getVideoMaskInfos().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        VideoMaskInfo next = it2.next();
                        if (next != null && Intrinsics.LJFF(next.showMask, Boolean.TRUE)) {
                            C786410Ut5.LLIIL((RelativeLayout) this.itemView.findViewById(R.id.uq_), 0);
                            break;
                        }
                    } else {
                        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
                        if (statusSafety != null && statusSafety.isProhibited()) {
                            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.ce3));
                            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
                            if (statusSafety2 != null && (reviewResult = statusSafety2.getReviewResult()) != null) {
                                coverNotice = reviewResult.getCoverNotice();
                            }
                            View viewFindViewById5 = this.itemView.findViewById(R.id.ene);
                            if (viewFindViewById5 != null) {
                                C786410Ut5.LJLLLLLL(0, viewFindViewById5);
                            }
                            TextView textView2 = (TextView) this.itemView.findViewById(R.id.ewp);
                            if (textView2 != null) {
                                textView2.setText(coverNotice);
                            }
                        } else {
                            AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
                            if (statusSafety3 != null && statusSafety3.isDelete() && (((video = aweme.getVideo()) != null && (cover = video.getDynamicCover()) != null) || (((video2 = aweme.getVideo()) == null || (cover2 = video2.getCover()) == null || (urlList = cover2.getUrlList()) == null || !urlList.isEmpty()) && (video3 = aweme.getVideo()) != null && (cover = video3.getCover()) != null))) {
                                TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.tki);
                                if (tuxIconView2 != null) {
                                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                                }
                                SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.video_image_hold);
                                if (smartImageView2 != null) {
                                    N5(smartImageView2, cover, Bitmap.Config.ARGB_8888);
                                }
                            }
                        }
                    }
                }
                if (PrivilegePageVideoListSetting.INSTANCE.isEnabled()) {
                    View viewFindViewById6 = this.itemView.findViewById(R.id.n81);
                    if (viewFindViewById6 != null) {
                        if ((I5(aweme) && L5(aweme)) || !I5(aweme) || ((contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && standardBusinessModel.getCmPreviewInfo() != null)) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        C786410Ut5.LJLLLLLL(i, viewFindViewById6);
                    }
                    View viewFindViewById7 = this.itemView.findViewById(R.id.n83);
                    if (viewFindViewById7 != null) {
                        if ((I5(aweme) && L5(aweme)) || L5(aweme)) {
                            i5 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i5, viewFindViewById7);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (c1906070zhV.LLIZ == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.wg8);
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
            C786410Ut5.K7(viewGroup, new ACListenerS143S0100000_8(this, 95));
        }
        final AwemeDraft awemeDraft = c1906070zhV.LLIZ;
        if (awemeDraft != null) {
            final SmartImageView smartImageView3 = (SmartImageView) this.itemView.findViewById(R.id.cover);
            ((IExternalService) this.LL.getValue()).draftService().loadThumbCover(awemeDraft, null, new IEffectService.OnVideoCoverCallback() { // from class: X.0M7H
                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i6) {
                    IAVInfoService iAVInfoServiceInfoService = ((IExternalService) this.LL.getValue()).abilityService().infoService();
                    AwemeDraft awemeDraft2 = awemeDraft;
                    final SmartImageView smartImageView4 = smartImageView3;
                    iAVInfoServiceInfoService.videoCover(awemeDraft2, new IAVInfoService.IGetInfoCallback<Bitmap>() { // from class: X.0M7I
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                        public final void finish(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            SmartImageView smartImageView5 = smartImageView4;
                            if (smartImageView5 != null) {
                                smartImageView5.setImageBitmap(bitmap2);
                            }
                        }
                    });
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    SmartImageView smartImageView4 = smartImageView3;
                    if (smartImageView4 != null) {
                        smartImageView4.setImageBitmap(bitmap);
                    }
                }
            });
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.zj5);
        Integer num = c1906070zhV.LLILZLL;
        if (num != null) {
            int iIntValue = num.intValue();
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(42);
                tuxTextView.setText(C497740JfY.LJIJJ(2131844275, Integer.valueOf(iIntValue)));
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "subonly_videolist");
        C20684815ws.LJIILLIIL("draft_show", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dhu, viewGroup, false);
    }

    public static void N5(SmartImageView smartImageView, UrlModel urlModel, Bitmap.Config config) {
        String uri;
        List<String> urlList;
        if (urlModel == null || (((uri = urlModel.getUri()) == null || a0.LJJJIL(uri)) && (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()))) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, smartImageView.getContext());
            if (numLIZJ != null) {
                smartImageView.setActualImageResource(numLIZJ.intValue());
                return;
            }
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        int[] iArrLIZ = C422830Gi1.LIZ(200);
        if (iArrLIZ != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LIZLLL("sub_only_video");
        if (config != null) {
            c1331670kl3LJIIIIZZ.LJIL = config;
        }
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }
}
