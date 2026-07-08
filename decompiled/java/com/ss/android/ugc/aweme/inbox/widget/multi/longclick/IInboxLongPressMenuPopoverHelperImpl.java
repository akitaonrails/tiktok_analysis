package com.ss.android.ugc.aweme.inbox.widget.multi.longclick;

import X.C0HIW;
import X.C0HIX;
import X.C0HUY;
import X.C0HWQ;
import X.C0IDB;
import X.C0P0T;
import X.C1308910kAL;
import X.C1342130l1v;
import X.C1391600mJi;
import X.C1440005kM;
import X.C15438062q;
import X.C1697810uHb;
import X.C1776900wLA;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C21647019ng;
import X.C418440Gaw;
import X.C443090HZb;
import X.C443270HZt;
import X.C443530HaJ;
import X.C462940IDk;
import X.C487280J9a;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C842150X1x;
import X.EnumC1235690iGF;
import X.EnumC19746112Nn;
import X.InterfaceC1340660kzY;
import X.InterfaceC487330J9f;
import Y.ATListenerS98S0400000_6;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.widget.multi.longclick.IInboxLongPressMenuPopoverHelperImpl;
import com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS68S0500000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IInboxLongPressMenuPopoverHelperImpl implements IInboxLongPressMenuPopoverHelper {
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0HZs, X.0J9f] */
    @Override // com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper
    public final void LIZ(C19EG c19eg, List<? extends List<C443090HZb>> list, View view) throws Throwable {
        final ViewGroup viewGroup;
        int iIntValue;
        View decorView = c19eg.getWindow().getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            final View view2 = new View(c19eg);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, c19eg);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view2.setBackgroundColor(iIntValue);
            C786410Ut5.T4(view2, 0.0f);
            viewGroup.addView(view2, new FrameLayout.LayoutParams(-1, -1));
            final ImageView imageView = new ImageView(c19eg);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Drawable background = view.getBackground();
            try {
                view.setBackground(C1308910kAL.LJ(R.attr.a1b, imageView.getContext()));
                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
                view.setBackground(background);
                C443530HaJ c443530HaJ = new C443530HaJ(c19eg.getResources(), bitmapCreateBitmap);
                c443530HaJ.LIZJ(C418440Gaw.LIZIZ(12));
                imageView.setImageDrawable(c443530HaJ);
                imageView.setOutlineProvider(new C0IDB(c443530HaJ, 2));
                imageView.setElevation(C418440Gaw.LIZIZ(4));
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
                layoutParams.leftMargin = iArr[0];
                layoutParams.topMargin = iArr[1];
                viewGroup.addView(imageView, layoutParams);
                view2.setOnTouchListener(new ATListenerS98S0400000_6(this, view2, imageView, viewGroup, 1));
                int i = 10;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (List<C443090HZb> list2 : list) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i));
                    for (C443090HZb c443090HZb : list2) {
                        arrayList2.add(new C443090HZb(c443090HZb.LIZ, new AwS68S0500000_6(this, view2, imageView, viewGroup, c443090HZb, 1), c443090HZb.LIZJ, c443090HZb.LIZLLL, c443090HZb.LJ, c443090HZb.LJFF, c443090HZb.LJI, c443090HZb.LJII, c443090HZb.LJIIIIZZ, c443090HZb.LJIIIZ));
                        i = 10;
                    }
                    arrayList.add(arrayList2);
                }
                C0HWQ c0hwq = new C0HWQ(c19eg);
                c0hwq.LJIIL(arrayList);
                c0hwq.LLILLJJLI.LJIIL = false;
                c0hwq.LJII(R.attr.a1b);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                int width = (int) (((double) iArr[0]) + (((double) (view.getWidth() * 0.060000002f)) * 0.5d));
                int height = (int) (((double) iArr[1]) + (((double) (view.getHeight() * 0.060000002f)) * 0.5d));
                int height2 = (int) (((double) (iArr[1] + view.getHeight())) - (((double) (view.getHeight() * 0.060000002f)) * 0.5d));
                int iLIZIZ2 = ((height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - width) - C497820Jfg.LIZJ(c19eg);
                int iLIZJ = ((C497820Jfg.LIZJ(c19eg) + C497820Jfg.LIZ(c19eg)) - width) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + height2);
                if (iLIZIZ2 >= iLIZJ) {
                    EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
                    C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
                    c1391600mJi.LIZLLL = enumC1235690iGF;
                    c1391600mJi.LJFF = -iLIZIZ;
                    c0hwq.LIZ(width, height);
                    c0hwq.LLJI = Math.min(iLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)));
                } else {
                    EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.BOTTOM;
                    C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
                    c1391600mJi2.LIZLLL = enumC1235690iGF2;
                    c1391600mJi2.LJFF = iLIZIZ;
                    c0hwq.LIZ(width, height2);
                    c0hwq.LLJI = Math.min(iLIZJ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)));
                }
                c0hwq.LLJ = true;
                int i2 = -c19eg.getWindow().getDecorView().getWidth();
                C1391600mJi c1391600mJi3 = c0hwq.LLILLJJLI;
                c1391600mJi3.LJ = i2;
                c1391600mJi3.LJIIIIZZ = width;
                c1391600mJi3.LJIJJLI = false;
                final C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
                final int i3 = c19eg.getResources().getConfiguration().orientation;
                final ?? r1 = new InterfaceC487330J9f() { // from class: X.0HZs
                    @Override // X.InterfaceC487330J9f
                    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                        int i4 = configuration.orientation;
                        if ((i4 == 2 || i4 == 1) && i4 != i3) {
                            IInboxLongPressMenuPopoverHelperImpl iInboxLongPressMenuPopoverHelperImpl = this;
                            View view3 = view2;
                            ImageView imageView2 = imageView;
                            ViewGroup viewGroup2 = viewGroup;
                            iInboxLongPressMenuPopoverHelperImpl.getClass();
                            IInboxLongPressMenuPopoverHelperImpl.LIZIZ(view3, imageView2, viewGroup2, false);
                            c0p0tLIZIZ.dismiss();
                        }
                    }
                };
                c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0HZr
                    @Override // X.InterfaceC1340660kzY
                    public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                        C1440005kM.LIZ(new C443270HZt(null, false));
                        C487280J9a.LIZJ(r1);
                    }
                });
                C487280J9a.LIZ(c19eg.hashCode(), r1);
                c0p0tLIZIZ.show();
                LIZIZ(view2, imageView, viewGroup, true);
                C1440005kM.LIZ(new C443270HZt(new AwS68S0500000_6(this, view2, imageView, viewGroup, c0p0tLIZIZ, 0), true));
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        view.setBackground(background);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
    }

    public static void LIZIZ(View view, View view2, ViewGroup viewGroup, boolean z) {
        List listLJIIJJI;
        C0HUY c0huy;
        C1776900wLA c1776900wLA = new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 400L);
        if (z) {
            listLJIIJJI = C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(1.0f, 0.94f)), new C19746412Nq("scaleY", new C0HIX(1.0f, 0.94f)));
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(new C19746412Nq("scaleX", new C0HIW(0.94f, 1.0f)), new C19746412Nq("scaleY", new C0HIX(0.94f, 1.0f)), new C19746412Nq("alpha", new C0HUY(1.0f, 0.0f)));
        }
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
        C21647019ng c21647019ng = new C21647019ng(view2.getContext(), view2, new C19746312Np(enumC19746112Nn, c1776900wLA, listLJIIJJI), false);
        if (!z) {
            c21647019ng.LIZJ("alpha", new C462940IDk(view2, viewGroup, 0));
        }
        c21647019ng.LJI(true);
        C1776900wLA c1776900wLA2 = new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(1.0f), new C1342130l1v(0.68f), new C1342130l1v(1.0f), 200L);
        if (z) {
            c0huy = new C0HUY(0.0f, 0.94f);
        } else {
            c0huy = new C0HUY(0.94f, 0.0f);
        }
        C21647019ng c21647019ng2 = new C21647019ng(view.getContext(), view, new C19746312Np(enumC19746112Nn, c1776900wLA2, Collections.singletonList(new C19746412Nq("alpha", c0huy))), false);
        if (!z) {
            c21647019ng2.LIZJ("alpha", new C462940IDk(view, viewGroup, 1));
        }
        c21647019ng2.LJI(true);
    }
}
