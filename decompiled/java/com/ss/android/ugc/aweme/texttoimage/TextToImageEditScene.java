package com.ss.android.ugc.aweme.texttoimage;

import X.C01GW;
import X.C0CHQ;
import X.C0FI2;
import X.C0LIQ;
import X.C0MGE;
import X.C0MUK;
import X.C0PEM;
import X.C0TVI;
import X.C0VSP;
import X.C122T;
import X.C1294250jmh;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1430905it;
import X.C14EU;
import X.C14K9;
import X.C1643380sro;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1766560w4U;
import X.C201955140j;
import X.C20622515mp;
import X.C2296808zG;
import X.C23250099c;
import X.C295710BiT;
import X.C452501pT;
import X.C560380LyO;
import X.C560470LyX;
import X.C562670M4z;
import X.C571960Mby;
import X.C571990Mc1;
import X.C572050Mc7;
import X.C572240McQ;
import X.C572540Mcu;
import X.C581210Mqt;
import X.C786410Ut5;
import X.C854840XgA;
import X.EnumC560450LyV;
import X.InterfaceC1331910klR;
import X.InterfaceC1455160nyE;
import X.InterfaceC20597015ii;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import Y.ACListenerS143S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageEditScene extends BaseScreenAdaptScene implements InterfaceC1455160nyE, C0MGE, InterfaceC524950KiL {
    public C571990Mc1 LLJJLIIIJLLLLLLLZ;
    public C571960Mby LLJL;
    public boolean LLJLIL;
    public boolean LLJLLIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 379));
    public final ArrayList<InterfaceC362610EJn> LLJLILLLLZIIL = new ArrayList<>();
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 378));

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC1455160nyE
    public final void LLJL() {
    }

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LLLLLJLJLL(int i, int i2) {
    }

    @Override // X.InterfaceC1455160nyE
    public final void Q4(String str, int i, int i2, int i3, boolean z) {
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
    }

    @Override // X.InterfaceC1455160nyE
    public final void t3() {
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJL.getValue();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        if (this.LLJLLIL) {
            finish();
            return true;
        }
        ArrayList<InterfaceC362610EJn> arrayList = this.LLJLILLLLZIIL;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<InterfaceC362610EJn> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        finish();
        return true;
    }

    public TextToImageEditScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(134));
        disableSupportRestore();
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (this.LLJLIL) {
            C572540Mcu.LIZ.getClass();
            File fileLIZIZ = C572540Mcu.LIZIZ();
            if (fileLIZIZ != null) {
                C1294250jmh.LJ(new C0VSP(fileLIZIZ), fileLIZIZ.getName()).LIZIZ(new C581210Mqt(this, 2));
            }
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "TextToImageEditScene onPause");
        C560380LyO.LJIIZILJ = EnumC560450LyV.EDIT;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "TextToImageEditScene onResume");
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.EDIT;
        C560380LyO.LJIIZILJ(enumC560450LyV, null, getEditModel());
        C560380LyO.LJIILLIIL(new C560470LyX(enumC560450LyV, System.currentTimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LIZIZ.LJIIL();
        tuxImmersionBarLJ.LJ(0);
        tuxImmersionBarLJ.LIZ(false);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZJ(false, false);
        tuxImmersionBarLJ.LIZLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C572240McQ.LIZJ += C572240McQ.LIZIZ > 0 ? System.currentTimeMillis() - C572240McQ.LIZIZ : 0L;
        C572240McQ.LIZIZ = 0L;
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJLILLLLZIIL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        this.LLJLILLLLZIIL.add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        boolean z;
        int iIntValue;
        LiveData<Boolean> liveDataUp;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("direct_to_choose");
        } else {
            z = false;
        }
        this.LLJLLIL = z;
        View view = this.mView;
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZLLL(0);
        c1643380sro.LJII = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = new int[2];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.aqr, requireActivity());
        int iIntValue2 = -1;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.aqs, requireActivity());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        iArr[1] = iIntValue2;
        c1643380sro.LIZJ = iArr;
        view.setBackground(c1643380sro.LIZ());
        C572540Mcu.LIZ.getClass();
        Uri uriLIZ = C572540Mcu.LIZ();
        if (uriLIZ == null) {
            uriLIZ = UriProtector.parse("");
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriLIZ);
        c1331670kl3LJI.LIZJ = requireActivity();
        c1331670kl3LJI.LJJII(new InterfaceC1331910klR() { // from class: X.0Mbx
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                View viewFindViewById;
                if (bitmap == null || this.LL.mViewDestroyed) {
                    return;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LL.getResources(), bitmap);
                C572540Mcu.LIZ.getClass();
                if (C572540Mcu.LIZ() != null) {
                    bitmapDrawable.setColorFilter(new PorterDuffColorFilter(Color.argb(8, 0, 0, 0), PorterDuff.Mode.DARKEN));
                }
                View view2 = this.LL.mView;
                if (view2 != null && (viewFindViewById = view2.findViewById(R.id.i3c)) != null) {
                    viewFindViewById.setBackground(bitmapDrawable);
                }
            }
        });
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(143));
        C1664590tQ1.LIZLLL(this, "TextToImageEditScene", false, new AwS587S0100000_8(this, 302), 2);
        C1664600tQ2.LIZ(this, "TextToImageEditScene", new AwS587S0100000_8(this, 305));
        C571990Mc1 c571990Mc1 = this.LLJJLIIIJLLLLLLLZ;
        if (c571990Mc1 != null && (liveDataUp = c571990Mc1.Up()) != null) {
            liveDataUp.observe(this, new AObserverS212S0100000_8(this, 50));
        }
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = new ARunnableS108S0100000_8(this, 67);
        C562670M4z.LIZ.getClass();
        if (C562670M4z.LJI && getEditModel().creativeModel.text2ImageModel.showEnterAnim && !this.LLJLLIL && !Intrinsics.LJFF(getEditModel().mShootWay, "mt_help_post_card_search") && C572540Mcu.LIZIZ() != null) {
            this.LLJLIL = true;
        } else {
            this.LLJLIL = false;
            File fileLIZIZ = C572540Mcu.LIZIZ();
            if (fileLIZIZ != null) {
                C1294250jmh.LJ(new C0VSP(fileLIZIZ), fileLIZIZ.getName()).LIZIZ(new C581210Mqt(this, 1));
            }
            aRunnableS108S0100000_8.run();
        }
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ac(this);
        }
        C0FI2.LJIJJ().LIZIZ();
        C572240McQ.LIZ.getClass();
        C572240McQ.LIZIZ = System.currentTimeMillis();
        C572240McQ.LJI = false;
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0CHQ.LIZ().LJJIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1430905it(null), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C854840XgA c854840XgA) {
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        SingleImageData next;
        String path;
        String path2;
        c854840XgA.LIZ(getEditModel());
        if (C295710BiT.LIZ()) {
            getEditModel().creativeModel.livePhotoModel = c854840XgA.LJJLIIIJJIZ;
            ImageAlbumData imageAlbumData = c854840XgA.LJJIJIL;
            if (imageAlbumData != null) {
                if (getEditModel().getImageAlbumData() == null) {
                    getEditModel().setImageAlbumData(imageAlbumData);
                } else {
                    ImageAlbumData imageAlbumData2 = getEditModel().getImageAlbumData();
                    if (imageAlbumData2 != null) {
                        imageList = imageAlbumData2.getImageList();
                    } else {
                        imageList = null;
                    }
                    ImageAlbumData imageAlbumData3 = getEditModel().getImageAlbumData();
                    if (imageAlbumData3 != null) {
                        imageAlbumData3.setImageList(imageAlbumData.getImageList());
                    }
                    if (imageList != null) {
                        for (SingleImageData singleImageData : imageList) {
                            ImageAlbumData imageAlbumData4 = getEditModel().getImageAlbumData();
                            if (imageAlbumData4 != null && (imageList2 = imageAlbumData4.getImageList()) != null) {
                                Iterator<SingleImageData> it2 = imageList2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        SrcImageInfo srcImageInfo = next.getSrcImageInfo();
                                        if (srcImageInfo != null) {
                                            path = srcImageInfo.getPath();
                                        } else {
                                            path = null;
                                        }
                                        SrcImageInfo srcImageInfo2 = singleImageData.getSrcImageInfo();
                                        if (srcImageInfo2 != null) {
                                            path2 = srcImageInfo2.getPath();
                                        } else {
                                            path2 = null;
                                        }
                                        if (Intrinsics.LJFF(path, path2)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                SingleImageData singleImageData2 = next;
                                if (singleImageData2 != null) {
                                    if (singleImageData2.getSynthesisData() == null && singleImageData.getSynthesisData() != null) {
                                        singleImageData2.setSynthesisData(singleImageData.getSynthesisData());
                                    }
                                    EditImageInfo editImageInfo = singleImageData2.getEditImageInfo();
                                    if (editImageInfo == null || editImageInfo.getTempSynthesisPath() == null) {
                                        EditImageInfo editImageInfo2 = singleImageData.getEditImageInfo();
                                        if (editImageInfo2 != null && editImageInfo2.getTempSynthesisPath() != null) {
                                            singleImageData2.getEditImageInfo().setTempSynthesisPath(singleImageData.getEditImageInfo().getTempSynthesisPath());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C572050Mc7.LIZIZ(getEditModel());
        } else {
            if (getEditModel().getImageAlbumData() == null) {
                getEditModel().setImageAlbumData(c854840XgA.LJJIJIL);
            }
            ImageAlbumData imageAlbumData5 = getEditModel().getImageAlbumData();
            if (imageAlbumData5 != null) {
                imageAlbumData5.setImageList(c854840XgA.LJJIJIL.getImageList());
            }
        }
        getEditModel().creativeModel.text2ImageModel.transToDesc = false;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0LIQ c0liq) {
        finish();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Mbw
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                if (Build.VERSION.SDK_INT >= 35) {
                    view2.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                }
                return C20246014Ju.LIZIZ;
            }
        });
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 81), view);
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ers, viewGroup, false);
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onResult(int i, int i2, Intent intent) {
        boolean zOnResult = super.onResult(i, i2, intent);
        if (i == 12345 && intent != null) {
            if (C295710BiT.LIZ()) {
                ImageAlbumData imageAlbumData = getEditModel().getImageAlbumData();
                getEditModel().creativeModel = C0MUK.LIZIZ(intent);
                if (getEditModel().getImageAlbumData() == null && imageAlbumData != null) {
                    getEditModel().setImageAlbumData(imageAlbumData);
                }
            } else {
                getEditModel().creativeModel = C0MUK.LIZIZ(intent);
                return zOnResult;
            }
        }
        return zOnResult;
    }
}
