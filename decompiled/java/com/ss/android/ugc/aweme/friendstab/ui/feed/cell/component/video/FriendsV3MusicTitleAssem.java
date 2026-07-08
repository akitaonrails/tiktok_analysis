package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video;

import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C21459118yT;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452501pT;
import X.C636110OxF;
import X.C705700RmC;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725880Sde;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC452301pR;
import X.InterfaceC1331800klG;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS468S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3MusicTitleAssem extends VideoMusicTitleAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLILLIL;
    public final C01GW LLLLILI;
    public final C01GW LLLLJ;
    public final InterfaceC1731706qJ LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3MusicTitleAssem.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLILLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3MusicTitleAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLLILI = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 2260));
        this.LLLLJ = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 2259));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoMusicTitleVM.class);
        this.LLLLJI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS577S0100000_33(c19719912DlLIZ, 2263), null, AFwS279S0000000_33.get$arr$(149));
        this.LLLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(150));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2261));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.b_6, new AwS577S0100000_33(this, 2262));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        TuxIconView tuxIconView;
        super.ep();
        if (C725880Sde.LIZ().enabled && C725880Sde.LIZ().displayType == 1 && (tuxIconView = (TuxIconView) getContentView().findViewById(R.id.ovk)) != null) {
            Xq(tuxIconView);
        }
    }

    public final void Xq(TuxIconView tuxIconView) {
        Object obj;
        C636110OxF c636110OxF = C636110OxF.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        c636110OxF.getClass();
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(C636110OxF.LIZ(aweme));
        if (imageUrlModelLIZ.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                C786410Ut5.W5(tuxIconView, layoutParams);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZ = R.raw.icon_music_note_s_alt;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                c419910GdJ.LJFF = true;
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = iLIZIZ;
            layoutParams2.height = iLIZIZ;
            C786410Ut5.W5(tuxIconView, layoutParams2);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJJ = EnumC1338240kve.CENTER_CROP;
            final Context context = tuxIconView.getContext();
            c1331670kl3LJIIIIZZ.LJJIJIL(new InterfaceC1331800klG(context) { // from class: X.0I7X
                public final Context LIZ;

                @Override // X.InterfaceC1331800klG
                public final String getKey() {
                    return "friends_v3_music_cover_badge_transform_v7";
                }

                {
                    this.LIZ = context;
                }

                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
                    if (bitmap != null && c0i7n != null) {
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            int iLIZ = (int) C0I7Z.LIZ(20);
                            float fLIZ = C339190DRl.LIZ(3.6f);
                            float fLIZ2 = C339190DRl.LIZ(11);
                            float fLIZ3 = C339190DRl.LIZ(5.0f);
                            int iLIZ2 = (int) C0I7Z.LIZ(11);
                            C1331870klN c1331870klNLIZ = ((C1331760klC) c0i7n).LIZ(iLIZ, iLIZ, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(c1331870klNLIZ.getBitmap());
                            float f = 1;
                            float f2 = 20;
                            RectF rectF = new RectF(C339190DRl.LIZ(f), C339190DRl.LIZ(f), C339190DRl.LIZ(f2) - C339190DRl.LIZ(f), C339190DRl.LIZ(f2) - C339190DRl.LIZ(f));
                            Path path = new Path();
                            path.addRoundRect(rectF, fLIZ, fLIZ, Path.Direction.CW);
                            float f3 = iLIZ;
                            float f4 = f3 - fLIZ2;
                            Path path2 = new Path();
                            path2.moveTo(0.0f, fLIZ3);
                            float f5 = fLIZ3 * 0.45f;
                            path2.cubicTo(0.0f, f5, f5, 0.0f, fLIZ3, 0.0f);
                            path2.lineTo(fLIZ2, 0.0f);
                            path2.lineTo(fLIZ2, fLIZ2);
                            path2.lineTo(0.0f, fLIZ2);
                            path2.close();
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                            Paint paint2 = new Paint(1);
                            paint2.setFilterBitmap(true);
                            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, f3, f3, null);
                            canvas.save();
                            canvas.clipPath(path);
                            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(f4, f4);
                            canvas.drawPath(path2, paint);
                            canvas.restore();
                            canvas.restoreToCount(iSaveLayer);
                            int i = iLIZ - iLIZ2;
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZ = R.raw.icon_music_note_s_alt_fill;
                            c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                            c419910GdJ2.LIZIZ = iLIZ2;
                            c419910GdJ2.LIZJ = iLIZ2;
                            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LIZ);
                            tuxIconDrawableLIZ.setBounds(i, i, iLIZ, iLIZ);
                            tuxIconDrawableLIZ.draw(canvas);
                            return c1331870klNLIZ;
                        }
                        return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                    }
                    if (c0i7n == null) {
                        return null;
                    }
                    return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                }

                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
                    return LIZIZ(bitmap, c0i7n);
                }
            });
            c1331670kl3LJIIIIZZ.LJJIIZI(new ColorDrawable(0));
            c1331670kl3LJIIIIZZ.LJJI(tuxIconView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        super.onViewCreated(view);
        if (C725880Sde.LIZ().enabled && C725880Sde.LIZ().displayType == 1 && (tuxIconView = (TuxIconView) getContentView().findViewById(R.id.ovk)) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 107));
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLJI.getValue(this, LLLLLILLIL[0]), new C2217381BqS() { // from class: X.0P1V
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0P1Y) obj).LL;
                }
            }, null, new AwS468S0200000_33(this, tuxIconView, 10), 6);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLL.getValue(), new C2217381BqS() { // from class: X.19rT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 32), 6);
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLLLJI;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLLLILLIL;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0P1z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P1Y) obj).LLILZ);
            }
        }, null, new AwS647S0100000_33(this, 10), 6);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLLLJI.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0P20
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P1Y) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0P21
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P1Y) obj).LLILZLL);
            }
        }, null, new AwS682S0100000_33(this, 3), 12);
    }

    public final void Zq(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMarqueeFadingEdge, width = ");
        sbLIZ.append(i);
        sbLIZ.append(", height = ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        float f = i;
        float fMin = Math.min(100.0f, f / 4.0f) / f;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{((Number) this.LLLLJ.getValue()).intValue(), ((Number) this.LLLLILI.getValue()).intValue(), ((Number) this.LLLLILI.getValue()).intValue(), ((Number) this.LLLLJ.getValue()).intValue()}, new float[]{0.0f, fMin, 1.0f - fMin, 1.0f}, Shader.TileMode.CLAMP);
        C21459118yT c21459118yT = this.LLLIIII;
        if (c21459118yT != null) {
            c21459118yT.setTextShader(linearGradient);
        }
    }
}
