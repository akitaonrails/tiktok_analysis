package com.ss.android.ugc.aweme.story.feed.common.sub.photo.component;

import X.C01GW;
import X.C03IT;
import X.C0AW5;
import X.C0RF0;
import X.C1308910kAL;
import X.C1318140kPE;
import X.C1331070kk5;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1389300mG0;
import X.C13LP;
import X.C1558520qew;
import X.C1888107aR;
import X.C1EE2;
import X.C2188811AlT;
import X.C281120B0c;
import X.C281150B0f;
import X.C287130BNf;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428600GrK;
import X.C437040HBu;
import X.C442540HWy;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C708700Rr2;
import X.C710930Rud;
import X.C720360SNm;
import X.C724270Sb3;
import X.C726890SfH;
import X.C738980Sym;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.EnumC1338240kve;
import X.EnumC714850S2h;
import X.InterfaceC1320380kSq;
import X.InterfaceC427850Gq7;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.BlurHashMetaDataSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.base.StoryBasePhotoSlotComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPhotoComponent extends StoryBasePhotoSlotComponent<StoryPhotoComponent> implements InterfaceC427850Gq7, StoryPhotoAbility {
    public static boolean LLLII;
    public Bitmap LLJLLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 629));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 623));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 626));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 631));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 624));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 625));
    public final C708700Rr2 LLLFFI = new C708700Rr2();
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 627));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 628));

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility
    public final RectF I8() {
        int[] iArr = new int[2];
        Gp().getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        RectF rectF = new RectF();
        Gp().getHierarchy().LJIIJ(rectF);
        float f = i2;
        rectF.top += f;
        rectF.bottom += f;
        float f2 = i;
        rectF.left += f2;
        rectF.right += f2;
        return rectF;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        this.LLJLLL = null;
        Gp().setImageBitmap(null);
        Gp().setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fd1;
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        FakePlayerAbility fakePlayerAbility;
        this.LLJLLL = null;
        if (C281150B0f.LIZ() && (fakePlayerAbility = (FakePlayerAbility) this.LLJZIJLIL.getValue()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            fakePlayerAbility.W71(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        }
        C708700Rr2 c708700Rr2 = this.LLLFFI;
        c708700Rr2.LIZ = 0L;
        c708700Rr2.LIZIZ = 0L;
        c708700Rr2.LIZLLL = false;
        c708700Rr2.LJ = 0L;
        c708700Rr2.LJIIIIZZ = false;
        c708700Rr2.LJII = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 630);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_photo_view", true, awS555S0100000_11);
    }

    public final SmartImageView Gp() {
        return (SmartImageView) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility
    public final void LJIILLIIL() {
        IPlayerComponentAbility iPlayerComponentAbility;
        if (!((Boolean) C287130BNf.LIZIZ.getValue()).booleanValue() && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLL.getValue()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            iPlayerComponentAbility.Y2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), false, true);
        }
        FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJZIJLIL.getValue();
        if (fakePlayerAbility != null) {
            fakePlayerAbility.D7();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility
    public final void pausePlay() {
        IPlayerComponentAbility iPlayerComponentAbility;
        if (!((Boolean) C287130BNf.LIZIZ.getValue()).booleanValue() && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLL.getValue()) != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            iPlayerComponentAbility.Y2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), false, true);
        }
        FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJZIJLIL.getValue();
        if (fakePlayerAbility != null) {
            fakePlayerAbility.lv();
        }
    }

    public final boolean Ip() {
        return C1389300mG0.LJIIJJI(jm().LIZIZ()) && C1888107aR.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected, aid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFFI.LIZ((String) this.LLLF.getValue(), (String) this.LLLFF.getValue(), "on_holder_unselected");
        this.LLLFFI.LJI = false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostDestroy: aid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        sbLIZ.append((videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) ? null : aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFFI.LIZ((String) this.LLLF.getValue(), (String) this.LLLFF.getValue(), "on_host_destroy");
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryPhotoAbility.class, null);
            if (Ip()) {
                C1558520qew.LJIIJJI(interfaceC665370Q7z, IPhotoSlidesAbility.class, null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void dp() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostPause: aid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFFI.LIZ((String) this.LLLF.getValue(), (String) this.LLLFF.getValue(), "on_host_pause");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostResume: aid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C708700Rr2 c708700Rr2 = this.LLLFFI;
        boolean z = c708700Rr2.LJI;
        c708700Rr2.LIZJ = 0L;
        c708700Rr2.LJFF.LIZJ(false);
        c708700Rr2.LJI = z;
        c708700Rr2.LIZJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility
    public final View getImageView() {
        return Gp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryPhotoAbility.class, null, null);
            if (Ip()) {
                C1558520qew.LJII(interfaceC665370Q7z, (InterfaceC494301wD) this.LLLFZ.getValue(), IPhotoSlidesAbility.class, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility
    public final Bitmap gG0() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.photo.base.StoryBasePhotoSlotComponent, X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        Object obj;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onImageSensibleLoaded: ");
            sbLIZ.append(jSONObject);
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject.get("from"));
            C2188811AlT.LIZIZ(sbLIZ);
            IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            ((VideoItemParams) obj).getAweme();
            CastIntegerProtector.parseInt(String.valueOf(jSONObject.get("from")));
            iFeedDebugService.LJIIZILJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final C437040HBu Fp(C428600GrK c428600GrK) {
        Object obj;
        View viewLJJIJL;
        Context context = Gp().getContext();
        Fragment fragment = null;
        if (context == null) {
            return null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int storyType = ((VideoItemParams) obj).getAweme().getStoryType();
        if (Bo()) {
            viewLJJIJL = LJJIJL();
        } else {
            viewLJJIJL = null;
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            fragment = c0rf0.LIZJ;
        }
        return C710930Rud.LIZ(context, c428600GrK, storyType, viewLJJIJL, fragment);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!LLLII) {
            C1318140kPE.LJII = BlurHashMetaDataSettings.getMetadata();
            LLLII = true;
        }
        C1331070kk5 hierarchy = Gp().getHierarchy();
        if (hierarchy != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            hierarchy.LJIJ(c419910GdJ.LIZ(view.getContext()), 5);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        boolean z;
        Bitmap.Config first;
        PhotoModeImage photoModeImage;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        ImagePreviewModel previewModel;
        String data;
        float fFloatValue;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        Integer blurHashPreviewType;
        PhotoModeImage photoModeImageLJIILIIL;
        int i;
        int i2;
        C437040HBu c437040HBuFp;
        VideoItemParams videoItemParams2 = videoItemParams;
        UrlModel urlModelLIZIZ = C710930Rud.LIZIZ(videoItemParams2.getAweme());
        if (urlModelLIZIZ != null && urlModelLIZIZ.getUrlList() != null) {
            this.LLJLLL = null;
            if (Ip() && (photoModeImageLJIILIIL = C720360SNm.LJIILIIL(videoItemParams2.getAweme(), 0, false)) != null && (i = photoModeImageLJIILIIL.width) > 0 && (i2 = photoModeImageLJIILIIL.height) > 0 && (c437040HBuFp = Fp(new C428600GrK(i, i2))) != null) {
                Ep(c437040HBuFp, true);
                HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 107));
            }
            C442540HWy c442540HWy = C442540HWy.LIZ;
            List<String> urlList = urlModelLIZIZ.getUrlList();
            if (urlList == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            c442540HWy.getClass();
            C442540HWy.LJ(str);
            this.LLLFFI.LIZ = System.currentTimeMillis();
            C01GW c01gw = C0AW5.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                first = Bitmap.Config.ARGB_8888;
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                first = C1EE2.LIZIZ.LJJZZI(urlModelLIZIZ).getFirst();
            } else {
                List<InteractStickerStruct> interactStickerStructs = videoItemParams2.getAweme().getInteractStickerStructs();
                if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
                    first = Bitmap.Config.ARGB_8888;
                } else {
                    first = Bitmap.Config.RGB_565;
                }
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModelLIZIZ.getUrlList()));
            c1331670kl3LJIIJ.LJJJIL = this;
            c1331670kl3LJIIJ.LIZLLL("story_photo");
            c1331670kl3LJIIJ.LJIL = first;
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            Context context = Gp().getContext();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ei, context);
            c419910GdJ.LIZ(context);
            PhotoModeImageInfo photoModeImageInfo2 = videoItemParams2.getAweme().getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (photoModeImage = (PhotoModeImage) C13LP.LJJJLZIJ(0, C720360SNm.LIZLLL(photoModeImageInfo2))) != null && (photoModeImageInfo = videoItemParams2.getAweme().getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (previewModel = urlModel.getPreviewModel()) != null && (data = previewModel.getData()) != null && data.length() != 0) {
                this.LLLFFI.LJIIIIZZ = true;
                if (Intrinsics.LJFF(Gp().getHierarchy().LJIIJJI(), InterfaceC1320380kSq.LIZJ)) {
                    int i3 = photoModeImage.width;
                    int i4 = photoModeImage.height;
                    c1331670kl3LJIIJ.LJJJLZIJ = i3;
                    c1331670kl3LJIIJ.LJJJZ = i4;
                } else if (Gp().getWidth() != 0 && Gp().getHeight() != 0) {
                    int width = Gp().getWidth();
                    int height = Gp().getHeight();
                    c1331670kl3LJIIJ.LJJJLZIJ = width;
                    c1331670kl3LJIIJ.LJJJZ = height;
                } else {
                    int i5 = photoModeImage.width;
                    int i6 = photoModeImage.height;
                    c1331670kl3LJIIJ.LJJJLZIJ = i5;
                    c1331670kl3LJIIJ.LJJJZ = i6;
                }
                PhotoModeImageInfo photoModeImageInfo3 = videoItemParams2.getAweme().getPhotoModeImageInfo();
                if (photoModeImageInfo3 != null && (imageList2 = photoModeImageInfo3.getImageList()) != null && (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList2)) != null && (blurHashPreviewType = photoModeImageUrlModel2.getBlurHashPreviewType()) != null && blurHashPreviewType.intValue() == 2) {
                    c1331670kl3LJIIJ.LIZIZ(data);
                } else {
                    float f = 20;
                    Float f2 = photoModeImage.aspectRatio;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    c1331670kl3LJIIJ.LJJJLIIL = 20;
                    c1331670kl3LJIIJ.LJJJLL = (int) (f / fFloatValue);
                    c1331670kl3LJIIJ.LJJJJZI = data;
                }
            }
            c1331670kl3LJIIJ.LJJ(Gp());
            c1331670kl3LJIIJ.LJIILJJIL = 0;
            if (((Number) C281120B0c.LIZ.getValue()).intValue() != 0) {
                c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIJ.LJJJJJ = "story_cache";
            }
            c1331670kl3LJIIJ.LJJII(new C738980Sym(this, 2));
            c1331670kl3LJIIJ.LJIIJ(this);
            return;
        }
        this.LLLFFI.LJII = "url_error";
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageSet, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void Ep(C437040HBu c437040HBu, boolean z) {
        int iIntValue;
        if (z && c437040HBu.LIZLLL <= 0) {
            C0RF0 c0rf0 = jm().LIZLLL;
            Fragment fragment = null;
            if (c0rf0 != null) {
                fragment = c0rf0.LIZJ;
            }
            Integer numValueOf = Integer.valueOf(C726890SfH.LIZIZ(fragment));
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = c437040HBu.LIZLLL;
            }
        } else {
            iIntValue = c437040HBu.LIZLLL;
        }
        SmartImageView smartImageViewGp = Gp();
        ViewGroup.LayoutParams layoutParams = smartImageViewGp.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = c437040HBu.LIZJ;
            marginLayoutParams.height = iIntValue;
            marginLayoutParams.topMargin = c437040HBu.LJ;
            C786410Ut5.W5(smartImageViewGp, marginLayoutParams);
            Gp().setActualImageScaleType(c437040HBu.LIZ);
            SmartImageView smartImageViewGp2 = Gp();
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = c437040HBu.LIZIZ;
            smartImageViewGp2.setCircleOptions(new C1331730kl9(c1331750klB));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, position = ");
        sbLIZ.append(i);
        sbLIZ.append(", aid = ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        C708700Rr2 c708700Rr2 = this.LLLFFI;
        c708700Rr2.LIZJ = 0L;
        c708700Rr2.LJFF.LIZJ(false);
        c708700Rr2.LJI = true;
        c708700Rr2.LIZJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        String string;
        C442540HWy c442540HWy = C442540HWy.LIZ;
        if (uri == null || (string = uri.toString()) == null) {
            string = "";
        }
        c442540HWy.getClass();
        C442540HWy.LIZLLL(string, th, false);
        C708700Rr2 c708700Rr2 = this.LLLFFI;
        c708700Rr2.LJII = "image_load_error";
        c708700Rr2.LIZ((String) this.LLLF.getValue(), (String) this.LLLFF.getValue(), "on_host_destroy");
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String string;
        String string2;
        Integer numValueOf;
        Integer numValueOf2;
        C437040HBu c437040HBuFp;
        FakePlayerAbility fakePlayerAbility;
        if (!this.LLJJIII) {
            return;
        }
        C708700Rr2 c708700Rr2 = this.LLLFFI;
        c708700Rr2.LIZLLL = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c708700Rr2.LIZIZ = jCurrentTimeMillis;
        long j = c708700Rr2.LIZ;
        if (j > 0) {
            c708700Rr2.LJ = jCurrentTimeMillis - j;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete, uri: ");
        sbLIZ.append(uri);
        sbLIZ.append(", image info: ");
        Object obj = null;
        if (c428600GrK != null) {
            string = c428600GrK.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        C442540HWy c442540HWy = C442540HWy.LIZ;
        if (uri == null || (string2 = uri.toString()) == null) {
            string2 = "";
        }
        if (c428600GrK != null) {
            numValueOf = Integer.valueOf(c428600GrK.LIZ);
            numValueOf2 = Integer.valueOf(c428600GrK.LIZIZ);
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        c442540HWy.getClass();
        C442540HWy.LJFF(numValueOf, numValueOf2, string2, false);
        if (c428600GrK != null && (c437040HBuFp = Fp(c428600GrK)) != null) {
            Ep(c437040HBuFp, false);
            if (C281150B0f.LIZ() && (fakePlayerAbility = (FakePlayerAbility) this.LLJZIJLIL.getValue()) != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                fakePlayerAbility.Np0(((VideoItemParams) obj).getAweme().getAid());
            }
        }
    }
}
