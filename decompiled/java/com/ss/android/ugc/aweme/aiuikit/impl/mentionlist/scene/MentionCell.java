package com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.scene;

import X.AbstractC20628015ni;
import X.C01GW;
import X.C0EBE;
import X.C0GYT;
import X.C0GZ3;
import X.C1308910kAL;
import X.C14MI;
import X.C1602160rnK;
import X.C1847590yBB;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C436180H8m;
import X.C452501pT;
import X.C547860LeC;
import X.C549450Lgl;
import X.C549860LhQ;
import X.C554260LoW;
import X.C554270LoX;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS41S0300000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionCell extends PowerCell<C554260LoW> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 104));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 107));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 111));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 108));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 110));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 109));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 105));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 106));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 112));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.oa;
    }

    public final C427660Gpo I5() {
        return (C427660Gpo) this.LL.getValue();
    }

    public final C1847590yBB L5() {
        return (C1847590yBB) this.LLILZ.getValue();
    }

    public final TuxTextView N5() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        I5().setSize(40);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C554260LoW item;
        boolean z;
        float f;
        boolean z2;
        float fLIZIZ;
        Bitmap bitmapDecodeResource;
        int iIntValue;
        long j;
        String str;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z3;
        float fLIZIZ2;
        C554260LoW c554260LoW = (C554260LoW) interfaceC1891350zJl;
        super.onBindItemView(c554260LoW);
        if (c554260LoW.LLILLL) {
            ((AbstractC20628015ni) this.LLJ.getValue()).setLoading(true);
            return;
        }
        ((AbstractC20628015ni) this.LLJ.getValue()).setLoading(false);
        if (c554260LoW.LLILZ) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZ.getValue());
            View view = (View) this.LLIZ.getValue();
            Context context = ((View) this.LLIZ.getValue()).getContext();
            if (context != null && C426750GoL.LIZLLL(context)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                fLIZIZ2 = -C418440Gaw.LIZIZ(6);
            } else {
                fLIZIZ2 = C418440Gaw.LIZIZ(6);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationX(fLIZIZ2);
            ((C1847590yBB) this.LLIZ.getValue()).setOutlineWidth(C418440Gaw.LIZIZ(2));
            C0GZ3.LIZ((View) this.LLIZLLLIL.getValue());
        } else {
            C436180H8m.LIZIZ((View) this.LLIZ.getValue());
        }
        C436180H8m.LIZIZ((View) this.LLILLJJLI.getValue());
        C436180H8m.LIZIZ(L5());
        C436180H8m.LIZIZ(I5());
        float f2 = 1.0f;
        C786410Ut5.v5(I5(), 1.0f);
        C786410Ut5.B5(N5(), 1.0f);
        N5().getPaint().setShader(null);
        boolean zLIZ = C549450Lgl.LIZ(c554260LoW.LL);
        View view2 = this.itemView;
        C554260LoW item2 = getItem();
        if ((item2 != null && item2.LLILLL) || ((item = getItem()) != null && Intrinsics.LJFF(item.LLILLJJLI, Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C549450Lgl.LIZIZ(c554260LoW.LL)) {
            f = 0.4f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view2, f);
        C427660Gpo c427660GpoI5 = I5();
        String str2 = c554260LoW.LL.iconUrl;
        if (str2 == null) {
            str2 = "";
        }
        C427660Gpo.LJIIJJI(c427660GpoI5, str2, false, null, null, false, false, null, null, false, null, 1022);
        N5().setText(c554260LoW.LL.name);
        if (C549450Lgl.LJI(c554260LoW.LL)) {
            View view3 = (View) this.LLILZIL.getValue();
            int visibility = view3.getVisibility();
            view3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, view3);
        } else {
            View view4 = (View) this.LLILZIL.getValue();
            int visibility2 = view4.getVisibility();
            view4.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, view4);
        }
        C554260LoW item3 = getItem();
        if (item3 != null && item3.LLIZLLLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zLIZ && !z2) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLILLJJLI.getValue());
            TuxTextView tuxTextViewN5 = N5();
            C554260LoW item4 = getItem();
            if (item4 == null || (str = item4.LLIZ) == null) {
                str = "Create Yours";
            }
            tuxTextViewN5.setText(str);
            int[] iArr = new int[4];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = -6357048;
            }
            iArr[0] = iIntValue2;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, this.itemView.getContext());
            if (numLIZJ2 != null) {
                iIntValue3 = numLIZJ2.intValue();
            } else {
                iIntValue3 = -16715320;
            }
            iArr[1] = iIntValue3;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, this.itemView.getContext());
            int iIntValue5 = -16716310;
            if (numLIZJ3 != null) {
                iIntValue4 = numLIZJ3.intValue();
            } else {
                iIntValue4 = -16716310;
            }
            iArr[2] = iIntValue4;
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ce, this.itemView.getContext());
            if (numLIZJ4 != null) {
                iIntValue5 = numLIZJ4.intValue();
            }
            iArr[3] = iIntValue5;
            HandlerHook.viewPost(N5(), new ARunnableS41S0300000_8(this, iArr, new float[]{0.0f, 0.3296f, 0.6723f, 1.0f}, 10));
        } else if (C549450Lgl.LJI(c554260LoW.LL) && !z2) {
            C0GYT c0gyt = (C0GYT) this.LLILZIL.getValue();
            Integer num = c554260LoW.LL.progress;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c0gyt.setProgress(iIntValue);
            C786410Ut5.B5(N5(), 0.4f);
            C786410Ut5.LJLLLLLL(0, I5());
        } else if (C549450Lgl.LJII(c554260LoW.LL) && !z2) {
            C786410Ut5.LJLLLLLL(0, I5());
            C786410Ut5.v5(I5(), 0.4f);
            C786410Ut5.B5(N5(), 0.4f);
            C1847590yBB c1847590yBBL5 = L5();
            Context context2 = L5().getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                fLIZIZ = -C418440Gaw.LIZIZ(4);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(4);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1847590yBBL5);
            c1847590yBBL5.setTranslationX(fLIZIZ);
            C786410Ut5.LJLLLLLL(0, L5());
            TuxIconView tuxIconView = (TuxIconView) this.LLILZLL.getValue();
            if (Intrinsics.LJFF(c554260LoW.LL.invited, Boolean.TRUE)) {
                f2 = 0.4f;
            }
            C786410Ut5.x5(tuxIconView, f2);
            C1847590yBB c1847590yBBL52 = L5();
            Context context3 = this.itemView.getContext();
            Bitmap bitmap = C554270LoX.LLJJJJLIIL;
            if (bitmap == null) {
                try {
                    C547860LeC.LIZ.getClass();
                    String strLIZ = C547860LeC.LJI().LIZ(C549860LhQ.LIZ);
                    if (strLIZ != null && strLIZ.length() != 0) {
                        bitmapDecodeResource = BitmapFactory.decodeFile(strLIZ);
                    } else {
                        bitmapDecodeResource = BitmapFactory.decodeResource(context3.getResources(), R.raw.icon_bell_fill);
                    }
                    C554270LoX.LLJJJJLIIL = bitmapDecodeResource;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Bitmap bitmap2 = C554270LoX.LLJJJJLIIL;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    }
                    C554270LoX.LLJJJJLIIL = null;
                }
                bitmap = C554270LoX.LLJJJJLIIL;
            }
            c1847590yBBL52.setHollowTemplateBitmap(bitmap);
            ImageView imageView = (ImageView) this.LLILZLL.getValue();
            C0GZ3.LIZIZ(imageView, C0GZ3.LIZLLL(imageView.getContext()), null, 1.0f, 0.0f, 0.0f, 1.0f, 0, 0, 0);
            I5().setForeground(C14MI.LIZ(this.itemView.getContext(), R.drawable.cm0));
        } else if (!C549450Lgl.LIZIZ(c554260LoW.LL)) {
            C786410Ut5.v5(I5(), 0.4f);
            C786410Ut5.B5(N5(), 0.4f);
            C786410Ut5.LJLLLLLL(0, I5());
        } else {
            C786410Ut5.LJLLLLLL(0, I5());
            I5().setForeground(null);
        }
        View view5 = this.itemView;
        if (L5().getVisibility() == 0) {
            j = 1000;
        } else {
            j = 300;
        }
        C786410Ut5.I7(new AkS80S0100000_8(j, c554260LoW, 37), view5);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Context context;
        Scene sceneLIZ = C0EBE.LIZ(viewGroup);
        if (sceneLIZ == null || (context = sceneLIZ.getSceneContext()) == null) {
            context = viewGroup.getContext();
        }
        return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.oa, viewGroup, false);
    }
}
