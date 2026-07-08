package com.ss.android.ugc.aweme.msg;

import X.C04TK;
import X.C06TB;
import X.C098200Yq;
import X.C0ID9;
import X.C0VSV;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZFW;
import X.C0ZK1;
import X.C0ZKF;
import X.C11FX;
import X.C1288120jco;
import X.C1324810kZz;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1335740krc;
import X.C1685300txQ;
import X.C189200o6;
import X.C19357310oF;
import X.C19659111vp;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C289770BXj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427870Gq9;
import X.C461720I8s;
import X.C592490NLr;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1288440jdK;
import X.EnumC1288880je2;
import X.EnumC19357210oE;
import X.InterfaceC1317730kOZ;
import X.InterfaceC1326920kdO;
import X.InterfaceC876950Yaj;
import X.TextureViewSurfaceTextureListenerC1288630jdd;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXValueParam;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.msg.OnboardingContentFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS67S2100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class OnboardingContentFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig/HELIOSLmEcJicjKD03ISsrCiA9PCAiPQkhKSIhLCEn";
    public C11FX LL;

    public static C0Y8T PR(String str) {
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(str);
        if (c0y8tLIZ == null) {
            return C0YSQ.LIZIZ(c0ysq).LJJIIJZLJL(C2095008Iq.LJIILIIL(str));
        }
        return c0y8tLIZ;
    }

    public static File NR(Context context, File file) throws Throwable {
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (bitmapDecodeFile == null) {
                return null;
            }
            int iMin = Math.min(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, (bitmapDecodeFile.getWidth() - iMin) / 2, (bitmapDecodeFile.getHeight() - iMin) / 2, iMin, iMin);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            float f = iMin / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            if (bitmapCreateBitmap != bitmapDecodeFile) {
                C786410Ut5.LJJJJ(bitmapCreateBitmap);
            }
            bitmapDecodeFile.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
            File fileCreateTempFile = File.createTempFile("avatar_circle_", ".png", C786410Ut5.w2(context));
            C0VSV c0vsv = new C0VSV(fileCreateTempFile);
            try {
                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                C2107108Nh.LIZ(c0vsv, null);
                bitmapCreateBitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap2);
                return fileCreateTempFile;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void OR(View view, C11FX c11fx) {
        String str;
        C0Y8T c0y8tPR;
        int i;
        int i2;
        View viewFindViewById = view.findViewById(R.id.pl_);
        if (viewFindViewById == null || (str = c11fx.LJIIIIZZ) == null || (c0y8tPR = PR(str)) == null) {
            return;
        }
        C0ZFW c0zfw = C0ZFW.LIZ;
        String strLJIILLIIL = c0zfw.LJIILLIIL(c0y8tPR);
        String strLJIIJ = c0zfw.LJIIJ(c0y8tPR);
        int memberCount = c0y8tPR.getMemberCount();
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        EnumC19357210oE enumC19357210oE = c11fx.LJII;
        if (enumC19357210oE == null) {
            i = -1;
        } else {
            i = C19357310oF.LIZ[enumC19357210oE.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                return;
            }
            View viewFindViewById2 = view.findViewById(R.id.hlo);
            if (viewFindViewById2 == null) {
                return;
            }
            View viewFindViewById3 = view.findViewById(R.id.hm4);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            if (viewFindViewById3 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
            TextView textView = (TextView) view.findViewById(R.id.hlr);
            if (textView != null) {
                textView.setText(strLJIIJ);
            }
            Context context = view.getContext();
            View viewFindViewById4 = view.findViewById(R.id.hln);
            if (viewFindViewById4 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
                Drawable drawableLIZ = c384050F3z.LIZ(context);
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZIZ(2);
                c19659111vp.LIZ = C418440Gaw.LIZIZ(18);
                viewFindViewById4.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
            }
            View viewFindViewById5 = view.findViewById(R.id.hlm);
            if (viewFindViewById5 != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)));
                viewFindViewById5.setBackground(c384050F3z2.LIZ(context));
            }
            View viewFindViewById6 = view.findViewById(R.id.hlx);
            if (viewFindViewById6 != null) {
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)));
                viewFindViewById6.setBackground(c384050F3z3.LIZ(context));
            }
            MR((C427870Gq9) view.findViewById(R.id.hlq), str, strLJIILLIIL);
            return;
        }
        View viewFindViewById7 = view.findViewById(R.id.hm4);
        if (viewFindViewById7 == null) {
            return;
        }
        View viewFindViewById8 = view.findViewById(R.id.hlo);
        C786410Ut5.LJLLLLLL(0, viewFindViewById7);
        if (viewFindViewById8 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById8);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-7750913, -5714187, 11063029});
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(26));
        viewFindViewById7.setBackground(gradientDrawable);
        View viewFindViewById9 = view.findViewById(R.id.hm1);
        if (viewFindViewById9 != null) {
            viewFindViewById9.setClipToOutline(true);
            viewFindViewById9.setOutlineProvider(new C0ID9(13));
        }
        Context context2 = view.getContext();
        if ((context2.getResources().getConfiguration().uiMode & 48) == 32) {
            i2 = -1728053248;
        } else {
            i2 = -419430401;
        }
        View viewFindViewById10 = view.findViewById(R.id.hm5);
        if (viewFindViewById10 != null) {
            C384050F3z c384050F3z4 = new C384050F3z();
            c384050F3z4.LIZ = Integer.valueOf(i2);
            c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT)));
            Drawable drawableLIZ2 = c384050F3z4.LIZ(context2);
            C19659111vp c19659111vp2 = new C19659111vp();
            c19659111vp2.LIZ = C418440Gaw.LIZIZ(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
            c19659111vp2.LIZIZ = 0.0f;
            c19659111vp2.LIZJ = 0.0f;
            c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(11);
            c19659111vp2.LJFF = 167772160;
            viewFindViewById10.setBackground(C426750GoL.LJIILIIL(drawableLIZ2, c19659111vp2.LIZ(context2)));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.hm7);
        if (textView2 != null) {
            textView2.setText(strLJIIJ);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.hm8);
        if (textView3 != null) {
            textView3.setText(view.getContext().getResources().getQuantityString(2131755366, memberCount, Integer.valueOf(memberCount)));
        }
        MR((C427870Gq9) view.findViewById(R.id.hm6), str, strLJIILLIIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C11FX c11fx = this.LL;
        if (c11fx != null && !c11fx.LJIILIIL) {
            c11fx.LJIILIIL = true;
            AwS67S2100000_29 awS67S2100000_29 = c11fx.LJIIIZ;
            if (awS67S2100000_29 != null) {
                awS67S2100000_29.invoke();
            }
        }
    }

    public static void MR(C427870Gq9 c427870Gq9, String str, String str2) {
        if (c427870Gq9 != null && str2 != null && str2.length() != 0) {
            IMAvatarLoaderApi.LIZ.getClass();
            C04TK.LIZIZ.LIZJ(c427870Gq9, "group_chat_invite_link_page").LIZLLL(str, str2, null, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        }
    }

    public static void RR(TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd, String str, String str2) {
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ;
        C1335740krc c1335740krc;
        File file;
        File fileNR;
        InterfaceC1326920kdO interfaceC1326920kdO;
        Context context = textureViewSurfaceTextureListenerC1288630jdd.getContext();
        try {
            C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(UriProtector.parse(str2));
            if (c1325710kbRLIZ != null) {
                C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                c1324810kZzLJI.getClass();
                C592490NLr c592490NLrLJ = c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ);
                C1328130kfL c1328130kfLLJIILIIL = C1328130kfL.LJIILIIL();
                if ((!C289770BXj.LIZ() || (interfaceC1326920kdO = (InterfaceC1326920kdO) c1328130kfLLJIILIIL.LJIIIZ().get(C06TB.DM_AVATAR.getSpace())) == null || (interfaceC1317730kOZLJIIJ = interfaceC1326920kdO.LJIIJ(c592490NLrLJ)) == null) && (interfaceC1317730kOZLJIIJ = c1328130kfLLJIILIIL.LJIJJ().LJIIJ(c592490NLrLJ)) == null) {
                    interfaceC1317730kOZLJIIJ = c1328130kfLLJIILIIL.LJIILL().LJIIJ(c592490NLrLJ);
                }
                if ((interfaceC1317730kOZLJIIJ instanceof C1335740krc) && (c1335740krc = (C1335740krc) interfaceC1317730kOZLJIIJ) != null && (file = c1335740krc.LIZ) != null && (fileNR = NR(context, file)) != null && fileNR.exists()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String parent = fileNR.getParent();
                    if (parent == null) {
                        parent = "";
                    }
                    sbLIZ.append(parent);
                    sbLIZ.append('/');
                    Pair pair = new Pair(C2188811AlT.LIZIZ(sbLIZ), fileNR.getName());
                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LIZIZ(EnumC1288440jdK.IMAGE_DIR_NAME, str, AnimaXValueParam.fromString((String) pair.getFirst()));
                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LIZIZ(EnumC1288440jdK.IMAGE_FILE_NAME, str, AnimaXValueParam.fromString((String) pair.getSecond()));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        float f;
        boolean z3;
        int i3;
        C0Y8T c0y8tPR;
        C0ZFW c0zfw;
        final String strLJIILLIIL;
        String str;
        C0Y8T c0y8tPR2;
        C0ZFW c0zfw2;
        final String strLJIILLIIL2;
        final String nickname;
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cjm, viewGroup, false);
        final C11FX c11fx = this.LL;
        C19GS c19gs = null;
        if (c11fx != null) {
            View viewFindViewById = viewTd.findViewById(R.id.plg);
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.plh);
            ((TextView) viewTd.findViewById(R.id.plf)).setText(c11fx.LIZ);
            CharSequence charSequence = c11fx.LIZ;
            if (charSequence != null && ((String) charSequence).length() != 0) {
                z = false;
            } else {
                z = true;
            }
            boolean z4 = !z;
            if (z4) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
            if (z4) {
                Integer num = c11fx.LIZIZ;
                if (num != null) {
                    tuxIconView.setIconRes(num.intValue());
                    Integer num2 = c11fx.LIZJ;
                    if (num2 != null) {
                        tuxIconView.setTintColorRes(num2.intValue());
                    }
                    C786410Ut5.LJLLLLLL(0, tuxIconView);
                } else {
                    C786410Ut5.LJLLLLLL(8, tuxIconView);
                }
            }
            TextView textView = (TextView) viewTd.findViewById(R.id.ple);
            textView.setText(c11fx.LIZLLL);
            CharSequence charSequence2 = c11fx.LIZLLL;
            if (charSequence2 != null && ((String) charSequence2).length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, textView);
            final TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) viewTd.findViewById(R.id.plb);
            if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                View viewFindViewById2 = viewTd.findViewById(R.id.pl_);
                if (C426750GoL.LIZLLL(viewTd.getContext())) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
                textureViewSurfaceTextureListenerC1288630jdd.setScaleX(f);
                String str2 = c11fx.LJI;
                if (str2 != null && str2.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    C786410Ut5.LJLLLLLL(8, textureViewSurfaceTextureListenerC1288630jdd);
                    OR(viewTd, c11fx);
                } else {
                    if (viewFindViewById2 != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    }
                    textureViewSurfaceTextureListenerC1288630jdd.clearAnimation();
                    textureViewSurfaceTextureListenerC1288630jdd.setStartFrame(0);
                    textureViewSurfaceTextureListenerC1288630jdd.setLoop(true);
                    EnumC19357210oE enumC19357210oE = c11fx.LJII;
                    if (enumC19357210oE == null) {
                        i3 = -1;
                    } else {
                        i3 = C19357310oF.LIZ[enumC19357210oE.ordinal()];
                    }
                    if (i3 != 1) {
                        if (i3 == 2 && (str = c11fx.LJIIIIZZ) != null && (c0y8tPR2 = PR(str)) != null && (strLJIILLIIL2 = (c0zfw2 = C0ZFW.LIZ).LJIILLIIL(c0y8tPR2)) != null) {
                            final String strLJIIJ = c0zfw2.LJIIJ(c0y8tPR2);
                            User userLIZLLL = C461720I8s.LIZLLL();
                            if (userLIZLLL != null) {
                                nickname = userLIZLLL.getNickname();
                            } else {
                                nickname = null;
                            }
                            if (nickname == null) {
                                nickname = "";
                            }
                            ViewGroup.LayoutParams layoutParams = textureViewSurfaceTextureListenerC1288630jdd.getLayoutParams();
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190));
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
                            textureViewSurfaceTextureListenerC1288630jdd.setLayoutParams(layoutParams);
                            textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LJIIIIZZ(new C1288120jco() { // from class: X.11vn
                                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                                public final void LJIIJJI(C1288070jcj c1288070jcj) {
                                    OnboardingContentFragment onboardingContentFragment = this.LIZ;
                                    TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = textureViewSurfaceTextureListenerC1288630jdd;
                                    String str3 = strLJIIJ;
                                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                    onboardingContentFragment.getClass();
                                    OnboardingContentFragment.SR(textureViewSurfaceTextureListenerC1288630jdd2, "text_groupname", str3, iLIZIZ, iLIZIZ2);
                                    OnboardingContentFragment onboardingContentFragment2 = this.LIZ;
                                    TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = textureViewSurfaceTextureListenerC1288630jdd;
                                    String str4 = nickname;
                                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                    onboardingContentFragment2.getClass();
                                    OnboardingContentFragment.SR(textureViewSurfaceTextureListenerC1288630jdd3, "text_username", str4, iLIZIZ3, iLIZIZ4);
                                    OnboardingContentFragment onboardingContentFragment3 = this.LIZ;
                                    TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd4 = textureViewSurfaceTextureListenerC1288630jdd;
                                    String str5 = strLJIILLIIL2;
                                    onboardingContentFragment3.getClass();
                                    OnboardingContentFragment.RR(textureViewSurfaceTextureListenerC1288630jdd4, "image_2", str5);
                                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().play();
                                }
                            });
                        }
                    } else {
                        String str3 = c11fx.LJIIIIZZ;
                        if (str3 != null && (c0y8tPR = PR(str3)) != null && (strLJIILLIIL = (c0zfw = C0ZFW.LIZ).LJIILLIIL(c0y8tPR)) != null) {
                            final String strLJIIJ2 = c0zfw.LJIIJ(c0y8tPR);
                            ViewGroup.LayoutParams layoutParams2 = textureViewSurfaceTextureListenerC1288630jdd.getLayoutParams();
                            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(215));
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
                            textureViewSurfaceTextureListenerC1288630jdd.setLayoutParams(layoutParams2);
                            textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LJIIIIZZ(new C1288120jco() { // from class: X.11vo
                                @Override // X.C1288120jco, X.InterfaceC1288110jcn
                                public final void LJIIJJI(C1288070jcj c1288070jcj) {
                                    OnboardingContentFragment onboardingContentFragment = this.LIZ;
                                    TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = textureViewSurfaceTextureListenerC1288630jdd;
                                    String str4 = strLJIIJ2;
                                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                    onboardingContentFragment.getClass();
                                    OnboardingContentFragment.SR(textureViewSurfaceTextureListenerC1288630jdd2, "text_groupname", str4, iLIZIZ, iLIZIZ2);
                                    OnboardingContentFragment onboardingContentFragment2 = this.LIZ;
                                    TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = textureViewSurfaceTextureListenerC1288630jdd;
                                    String str5 = strLJIILLIIL;
                                    onboardingContentFragment2.getClass();
                                    OnboardingContentFragment.RR(textureViewSurfaceTextureListenerC1288630jdd3, "image_1", str5);
                                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().play();
                                }
                            });
                        }
                    }
                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LJIIIIZZ(new C1288120jco() { // from class: X.11Fd
                        @Override // X.C1288120jco, X.InterfaceC1288110jcn
                        public final void LJIIIIZZ(C1288060jci c1288060jci) {
                            C786410Ut5.LJLLLLLL(8, textureViewSurfaceTextureListenerC1288630jdd);
                            OnboardingContentFragment onboardingContentFragment = this;
                            View view = viewTd;
                            C11FX c11fx2 = c11fx;
                            onboardingContentFragment.getClass();
                            OnboardingContentFragment.OR(view, c11fx2);
                        }

                        @Override // X.C1288120jco, X.InterfaceC1288110jcn
                        public final void LJIIJJI(C1288070jcj c1288070jcj) {
                            C11FX c11fx2 = c11fx;
                            if (!c11fx2.LJIILJJIL) {
                                c11fx2.LJIILJJIL = true;
                                AwS573S0100000_29 awS573S0100000_29 = c11fx2.LJIIJJI;
                                if (awS573S0100000_29 != null) {
                                    awS573S0100000_29.invoke();
                                }
                            }
                        }
                    });
                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().setAutoPlay(false);
                    textureViewSurfaceTextureListenerC1288630jdd.getPlayer().setDynamicResource(true);
                    textureViewSurfaceTextureListenerC1288630jdd.setSrc(str2);
                }
            }
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public static void SR(TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd, String str, String str2, int i, int i2) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i2);
        textureViewSurfaceTextureListenerC1288630jdd.getPlayer().LJIIIZ(EnumC1288880je2.TEXT_VALUE, new AnimaXKeyPath("**", str), AnimaXValueParam.fromString(TextUtils.ellipsize(str2, textPaint, i, TextUtils.TruncateAt.END).toString()));
    }
}
