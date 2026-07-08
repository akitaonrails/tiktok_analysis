package com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list;

import X.AbstractC1377610lx9;
import X.AnonymousClass0956;
import X.C01GW;
import X.C07IE;
import X.C07QI;
import X.C09R3;
import X.C0DSB;
import X.C0GY9;
import X.C0N57;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1323170kXL;
import X.C1323180kXM;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1361400lX0;
import X.C1361405Um;
import X.C1361505Un;
import X.C1385040m98;
import X.C1388190mED;
import X.C1388380mEW;
import X.C1388420mEa;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C18082076i;
import X.C1818907Al;
import X.C1856690yPr;
import X.C1856720yPu;
import X.C1856890yQB;
import X.C1858670yT3;
import X.C1862330yYx;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C298810BnT;
import X.C384050F3z;
import X.C418330Gal;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C621180OYa;
import X.C687700QyG;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1361305Ul;
import X.InterfaceC1587906Jp;
import X.InterfaceC1856570yPf;
import X.InterfaceC1856750yPx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS161S0100000_27;
import Y.ACListenerS91S0300000_27;
import Y.ATListenerS459S0100000_27;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoShareConfiguration;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnswerImageListItemAssem extends ReusedUISlotAssem<TakoAnswerImageListItemAssem> implements InterfaceC712990Rxx<C1856720yPu>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public View LLJL;
    public ConstraintLayout LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public C1323170kXL LLJLL;
    public C418330Gal LLJLLIL;
    public FrameLayout LLJLLL;
    public FrameLayout LLJZ;
    public TuxIconView LLJZIJLIL;
    public FrameLayout LLL;
    public boolean LLLF;
    public InterfaceC1856750yPx LLLFF;
    public BaseImage LLLFFI;
    public int LLLFZ;
    public ValueAnimator LLLI;
    public C1323180kXM LLLII;
    public float LLLIIIL;
    public float LLLIIL;
    public String LLLILZ;
    public String LLLILZJ;
    public AnonymousClass0956 LLLILZLLLI;
    public volatile InterfaceC1856570yPf LLLJ;
    public volatile TakoSharePreviewAbility LLLJIL;
    public InterfaceC665370Q7z LLLJL;
    public C0QSJ LLLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 712));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 710));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 711));
    public final AwS606S0100000_27 LLLIILIL = new AwS606S0100000_27(this, 208);
    public final AwS606S0100000_27 LLLIL = new AwS606S0100000_27(this, 209);
    public final List<Interpolator> LLLIZZ = C1697810uHb.LJIIJJI(C1619980sG4.LJI(), C1619980sG4.LJFF(), C1619980sG4.LJ(), C0GY9.LIZIZ(0.76f, 0.0f, 0.24f, 1.0f));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAnswerImageListItemAssem.class, "contentPreviewAbility", "getContentPreviewAbility()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAnswerImageListItemAssem.class, "sharePreviewAbility", "getSharePreviewAbility()Lcom/ss/android/ugc/aweme/tako/botpage/components/share/TakoSharePreviewAbility;", 0);
        c09r3.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fk1;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final ITakoContextAbility Ap() {
        return (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void Ip() {
        Context context;
        Activity activityLIZ;
        TakoCardAbility takoCardAbility;
        Message messageYy1;
        Map<String, String> mapLJ;
        String strNZ0;
        BaseImage baseImage = this.LLLFFI;
        if (baseImage == null || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoCardAbility.class, null)) == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return;
        }
        List<String> list = baseImage.urlList;
        String str = list != null ? (String) C13LP.LJJJLL(list) : null;
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null) {
            iTakoChatPageAbility.Zu2();
        }
        C1361405Um c1361405Um = InterfaceC1361305Ul.LJJJJL;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        c1361405Um.getClass();
        C1361505Un c1361505Un = new C1361505Un(interfaceC665370Q7zLJIIL);
        TakoContentPreviewItem.Image image = new TakoContentPreviewItem.Image(baseImage.width, baseImage.height, baseImage.imageUuid, baseImage.urlList);
        if (!C298810BnT.LIZ() || str == null || str.length() == 0) {
            TakoSharePreviewAbility takoSharePreviewAbilityYp = yp();
            if (takoSharePreviewAbilityYp != null) {
                takoSharePreviewAbilityYp.zv0(image, c1361505Un, AFwS216S0000000_27.get$arr$(304), false);
                return;
            }
            return;
        }
        ITakoContextAbility iTakoContextAbilityAp = Ap();
        if (iTakoContextAbilityAp == null || (mapLJ = iTakoContextAbilityAp.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        boolean zLIZJ = C1858670yT3.LIZJ(messageYy1);
        String str2 = messageYy1.uuid;
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        TakoSharePreviewAbility takoSharePreviewAbilityYp2 = yp();
        if (C298810BnT.LIZ() && takoSharePreviewAbilityYp2 != null) {
            String str3 = (String) C13LP.LJJJLL(image.imageUrls);
            if (str3 == null) {
                str3 = "";
            }
            String string = UUID.randomUUID().toString();
            final TakoImageShareModel takoImageShareModel = new TakoImageShareModel(new C1856890yQB(string, str3, zLIZJ, str2, "", null, null));
            TakoImageSharePackage takoImageSharePackage = new TakoImageSharePackage(new AbstractC1377610lx9(takoImageShareModel) { // from class: X.0yQA
                public final TakoImageShareModel LIZ;

                @Override // X.AbstractC1377630lxB
                public final String LIZJ() {
                    return "tako_local_image";
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZ() {
                    String str4 = this.LIZ.takoImageShareInfo.shareDescStr;
                    return str4 == null ? "" : str4;
                }

                @Override // X.AbstractC1377630lxB
                public final String LIZIZ() {
                    return this.LIZ.takoImageShareInfo.shareId;
                }

                @Override // X.AbstractC1377630lxB
                public final Bundle LJFF() {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("tako_share_image_url", this.LIZ.takoImageShareInfo.imageUrl, bundle);
                    bundle.putBoolean("tako_share_is_aigc", this.LIZ.takoImageShareInfo.isAIGC());
                    return bundle;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJI() {
                    String str4 = this.LIZ.takoImageShareInfo.shareTitleStr;
                    return str4 == null ? "" : str4;
                }

                @Override // X.AbstractC1377630lxB
                public final String LJII() {
                    return this.LIZ.takoImageShareInfo.sharePageUrl;
                }

                @Override // X.AbstractC1377630lxB
                public final ShareModel LJ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = takoImageShareModel;
                }
            }.LJIIIIZZ());
            C1388380mEW c1388380mEW = new C1388380mEW(new AwS571S0100000_27(takoSharePreviewAbilityYp2, 1301));
            c1388380mEW.LIZLLL = new AwS600S0100000_21(takoSharePreviewAbilityYp2, 336);
            C1388420mEa.LIZ.put(takoImageSharePackage, c1388380mEW);
            takoSharePreviewAbilityYp2.zv0(image, c1361505Un, new AwS565S0100000_21(takoImageSharePackage, 1443), false);
            Float fValueOf = Float.valueOf(C0N57.LIZ.LIZ());
            if (fValueOf.floatValue() > 0.0f) {
                takoSharePreviewAbilityYp2.yx1(fValueOf.floatValue());
            }
            takoImageSharePackage.isVideoMedia = false;
            C786410Ut5.LJJJI("enter_from", "message_history", takoImageSharePackage.extras);
            takoImageSharePackage.commonParams = mapLJ;
            takoImageSharePackage.mobMessageId = str2;
            takoImageSharePackage.screenType = strNZ0;
            Bundle bundle = takoImageSharePackage.extras;
            String str4 = mapLJ.get("enter_from");
            if (str4 == null) {
                str4 = "";
            }
            C786410Ut5.LJJJI("enter_from", str4, bundle);
            Bundle bundle2 = takoImageSharePackage.extras;
            String str5 = mapLJ.get("enter_method");
            if (str5 == null) {
                str5 = "";
            }
            C786410Ut5.LJJJI("enter_method", str5, bundle2);
            Bundle bundle3 = takoImageSharePackage.extras;
            String str6 = mapLJ.get("process_id");
            if (str6 == null) {
                str6 = "";
            }
            C786410Ut5.LJJJI("process_id", str6, bundle3);
            Bundle bundle4 = takoImageSharePackage.extras;
            String str7 = mapLJ.get("tako_session_id");
            if (str7 == null) {
                str7 = "";
            }
            C786410Ut5.LJJJI("tako_session_id", str7, bundle4);
            Bundle bundle5 = takoImageSharePackage.extras;
            String str8 = mapLJ.get("tako_chat_id");
            if (str8 == null) {
                str8 = "";
            }
            C786410Ut5.LJJJI("tako_chat_id", str8, bundle5);
            Bundle bundle6 = takoImageSharePackage.extras;
            String str9 = mapLJ.get("process_id");
            if (str9 == null) {
                str9 = "";
            }
            C786410Ut5.LJJJI("tako_process_id", str9, bundle6);
            C786410Ut5.LJJJI("tako_message_id", str2, takoImageSharePackage.extras);
            takoImageSharePackage.mediaSourceUrl = str3;
            takoImageSharePackage.mediaShareId = string;
            takoImageSharePackage.isAIGCContent = zLIZJ;
            ShareExtService shareExtService = (ShareExtService) PluggableExtentionKt.pluggableSpi$default(ShareExtService.class, false, false, false, 14, null);
            if (shareExtService != null) {
                shareExtService.LJLIL(takoImageSharePackage);
            }
            C621180OYa.LIZ.LJIIZILJ(takoImageSharePackage, activityLIZ, TakoShareConfiguration.LLILLJJLI);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str10 = mapLJ.get("enter_from");
        if (str10 == null) {
            str10 = "";
        }
        String str11 = mapLJ.get("enter_method");
        if (str11 == null) {
            str11 = "";
        }
        String str12 = mapLJ.get("process_id");
        if (str12 == null) {
            str12 = "";
        }
        String str13 = mapLJ.get("tako_session_id");
        C1862330yYx.LJJI(c1862330yYx, str10, str11, str12, str13 != null ? str13 : "", mapLJ.get("tako_chat_id"), "share_picture", null, null, null, C2097908Jt.LIZJ(new Pair("message_id", messageYy1.uuid)), 960);
    }

    public final C0QSJ tp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoFragmentScope.class});
        this.LLLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1856570yPf up() {
        InterfaceC1856570yPf interfaceC1856570yPf = this.LLLJ;
        if (interfaceC1856570yPf == null) {
            synchronized (this) {
                interfaceC1856570yPf = this.LLLJ;
                if (interfaceC1856570yPf == null) {
                    C0QSJ c0qsjTp = tp();
                    InterfaceC1856570yPf interfaceC1856570yPf2 = c0qsjTp != null ? (InterfaceC1856570yPf) c0qsjTp.getAbility(InterfaceC1856570yPf.class) : null;
                    this.LLLJ = interfaceC1856570yPf2;
                    return interfaceC1856570yPf2;
                }
            }
        }
        return interfaceC1856570yPf;
    }

    public final TakoSharePreviewAbility yp() {
        TakoSharePreviewAbility takoSharePreviewAbility = this.LLLJIL;
        if (takoSharePreviewAbility == null) {
            synchronized (this) {
                takoSharePreviewAbility = this.LLLJIL;
                if (takoSharePreviewAbility == null) {
                    C0QSJ c0qsjTp = tp();
                    TakoSharePreviewAbility takoSharePreviewAbility2 = c0qsjTp != null ? (TakoSharePreviewAbility) c0qsjTp.getAbility(TakoSharePreviewAbility.class) : null;
                    this.LLLJIL = takoSharePreviewAbility2;
                    return takoSharePreviewAbility2;
                }
            }
        }
        return takoSharePreviewAbility;
    }

    public final TakoCardAbility zp() {
        return (TakoCardAbility) this.LLLIIIIL.getValue();
    }

    public static C1323180kXM sp(int i) {
        int i2;
        if (!C1818907Al.LIZ()) {
            return new C1323180kXM(0);
        }
        if (i != 0) {
            i2 = R.drawable.df6;
        } else {
            i2 = R.drawable.df5;
        }
        return new C1323180kXM(true, i2);
    }

    public final void Ep(int i) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (((C1856720yPu) obj).LLILLJJLI == 0) {
            Integer numValueOf = Integer.valueOf(i);
            Map<String, Integer> map = C1856720yPu.LLILZ;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            map.put(((C1856720yPu) obj2).LL.LJJIJLIJ(), numValueOf);
        }
    }

    public final void Fp(boolean z) {
        Integer numLIZJ;
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            if (z) {
                TuxIconView tuxIconView = this.LLJZIJLIL;
                if (tuxIconView != null) {
                    tuxIconView.setImageDrawable((Drawable) this.LLLIIII.getValue());
                }
                C1856690yPr c1856690yPr = (C1856690yPr) this.LLLIIII.getValue();
                if (c1856690yPr != null) {
                    c1856690yPr.LJIIIZ();
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LLJZIJLIL;
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                Context context = getContext();
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                } else {
                    numLIZJ = null;
                }
                c419910GdJ.LIZLLL = numLIZJ;
                tuxIconView2.setTuxIcon(c419910GdJ);
            }
            C1856690yPr c1856690yPr2 = (C1856690yPr) this.LLLIIII.getValue();
            if (c1856690yPr2 == null) {
                return;
            }
            c1856690yPr2.LJIIJ();
        }
    }

    public final void Gp(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        c384050F3z.LIZLLL = Integer.valueOf(iLIZIZ);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C426750GoL.LJIIL(view, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        int iIntValue;
        this.LLJL = view.findViewById(R.id.x4h);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.x4i);
        FrameLayout frameLayout = null;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS161S0100000_27(this, 62));
            constraintLayout.setOnTouchListener(new ATListenerS459S0100000_27(this, 1));
            constraintLayout.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 1));
        } else {
            constraintLayout = null;
        }
        this.LLJLIL = constraintLayout;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.x4n);
        C1331070kk5 hierarchy = smartImageView.getHierarchy();
        if (hierarchy != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LJII(C418440Gaw.LIZIZ(16));
            hierarchy.LJJIII(c1331100kk8);
        }
        this.LLJLILLLLZIIL = smartImageView;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1323180kXM c1323180kXMSp = sp(((C1856720yPu) obj).LLILLJJLI);
        this.LLLII = c1323180kXMSp;
        C1323170kXL c1323170kXL = (C1323170kXL) view.findViewById(R.id.x4o);
        c1323170kXL.LIZJ(true, c1323180kXMSp);
        this.LLJLL = c1323170kXL;
        C418330Gal c418330Gal = (C418330Gal) view.findViewById(R.id.x4t);
        if (c418330Gal != null) {
            c418330Gal.setGravity(17);
            Gp(c418330Gal);
            C0DSB.LIZIZ(c418330Gal);
        } else {
            c418330Gal = null;
        }
        this.LLJLLIL = c418330Gal;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.x4q);
        if (frameLayout2 != null) {
            if (C07IE.LIZ()) {
                C0DSB.LIZJ(frameLayout2);
                C786410Ut5.O7(frameLayout2, new ACListenerS161S0100000_27(this, 63));
            } else {
                C0DSB.LIZIZ(frameLayout2);
            }
        } else {
            frameLayout2 = null;
        }
        this.LLJLLL = frameLayout2;
        View viewFindViewById = view.findViewById(R.id.x4p);
        if (viewFindViewById != null) {
            C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(viewFindViewById.getContext(), false);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            int iLIZJ = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ);
            if (iLIZJ == null) {
                iLIZJ = 0;
            }
            c384050F3z.LIZ = iLIZJ;
            viewFindViewById.setBackground(c384050F3z.LIZ(c1361400lX0LIZ));
            C2211631BhB.LJ(viewFindViewById, new AwS606S0100000_27(this, 210));
        }
        TextView textView = (TextView) view.findViewById(R.id.x4s);
        if (textView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, C1385040m98.LIZ(textView.getContext(), false));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setTextColor(iIntValue);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.x4r);
        if (tuxIconView != null) {
            C1361400lX0 c1361400lX0LIZ2 = C1385040m98.LIZ(tuxIconView.getContext(), false);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_plus;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ2);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.x4k);
        if (frameLayout3 != null) {
            C786410Ut5.O7(frameLayout3, new ACListenerS161S0100000_27(this, 64));
        } else {
            frameLayout3 = null;
        }
        this.LLJZ = frameLayout3;
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.x4j);
        if (tuxIconView2 != null) {
            C1361400lX0 c1361400lX0LIZ3 = C1385040m98.LIZ(tuxIconView2.getContext(), false);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_arrow_down_to_line;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ3);
            tuxIconView2.setTuxIcon(c419910GdJ2);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            int iLIZJ2 = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ3);
            if (iLIZJ2 == null) {
                iLIZJ2 = 0;
            }
            c384050F3z2.LIZ = iLIZJ2;
            tuxIconView2.setBackground(c384050F3z2.LIZ(c1361400lX0LIZ3));
        } else {
            tuxIconView2 = null;
        }
        this.LLJZIJLIL = tuxIconView2;
        if (((Number) C18082076i.LIZ.getValue()).intValue() != 0) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            List<ImageAction> listLJZ = ((C1856720yPu) obj2).LL.LJZ();
            if (listLJZ != null) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                } else {
                    obj3 = null;
                }
                ImageAction imageAction = (ImageAction) C13LP.LJJJLZIJ(((C1856720yPu) obj3).LLILLJJLI, listLJZ);
                if (imageAction != null && imageAction.bypassImg2Video) {
                    return;
                }
            }
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoChatUIAbility.class, null);
            if (takoChatUIAbility != null && takoChatUIAbility.Gx1()) {
                return;
            }
            FrameLayout frameLayout4 = (FrameLayout) view.findViewById(R.id.x4m);
            if (frameLayout4 != null) {
                C786410Ut5.O7(frameLayout4, new ACListenerS91S0300000_27(this, frameLayout4, view, 11));
                frameLayout = frameLayout4;
            }
            this.LLL = frameLayout;
            TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.f825x4l);
            if (tuxIconView3 == null) {
                return;
            }
            C1361400lX0 c1361400lX0LIZ4 = C1385040m98.LIZ(tuxIconView3.getContext(), false);
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_ai_video;
            c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ4);
            tuxIconView3.setTuxIcon(c419910GdJ3);
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            int iLIZJ3 = C1308910kAL.LIZJ(R.attr.zg, c1361400lX0LIZ4);
            if (iLIZJ3 == null) {
                iLIZJ3 = 0;
            }
            c384050F3z3.LIZ = iLIZJ3;
            tuxIconView3.setBackground(c384050F3z3.LIZ(c1361400lX0LIZ4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4, r6.thumbnailUrlList) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1856720yPu r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1856720yPu c1856720yPu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1856720yPu c1856720yPu) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void op(com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem r5, X.InterfaceC1856750yPx r6) {
        /*
            android.animation.ValueAnimator r0 = r5.LLLI
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            X.0kXL r0 = r5.LLJLL
            if (r0 == 0) goto Le
            r0.LJ()
        Le:
            X.0kXL r0 = r5.LLJLL
            if (r0 == 0) goto L15
            X.C0DSB.LIZIZ(r0)
        L15:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.LLJLIL
            if (r0 == 0) goto L1c
            X.C0DSB.LIZIZ(r0)
        L1c:
            com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility r0 = r5.zp()
            r4 = 0
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r2 = r0.Yy1()
        L27:
            r1 = 1
            r3 = 0
            if (r2 == 0) goto L58
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r2.LJIIIZ()
            if (r0 == 0) goto L58
            boolean r0 = X.AnonymousClass1418.LJFF(r0)
            if (r0 != r1) goto L58
        L37:
            X.0Gal r0 = r5.LLJLLIL
            if (r0 == 0) goto L3e
            X.C0DSB.LIZJ(r0)
        L3e:
            android.view.View r0 = r5.LLJL
            if (r0 == 0) goto L45
            r0.setBackground(r4)
        L45:
            com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility r2 = r5.zp()
            if (r2 == 0) goto L57
            if (r6 == 0) goto L51
            java.lang.String r4 = r6.LJJIJLIJ()
        L51:
            r1 = -1
            java.lang.String r0 = ""
            r2.Ed0(r1, r4, r0, r3)
        L57:
            return
        L58:
            X.0g7E r0 = X.C1153220g7E.LIZ
            r0.getClass()
            X.01GW r0 = X.C1153220g7E.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L73
            if (r2 == 0) goto L73
            int r1 = r2.serverStatus
            r0 = 4
            if (r1 != r0) goto L73
            goto L37
        L73:
            X.0Gal r0 = r5.LLJLLIL
            if (r0 == 0) goto L7a
            X.C0DSB.LIZIZ(r0)
        L7a:
            android.view.View r2 = r5.LLJL
            if (r2 == 0) goto L45
            X.0F3z r1 = new X.0F3z
            r1.<init>()
            r0 = 2131099674(0x7f06001a, float:1.7811708E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.LIZJ = r0
            android.content.Context r0 = r2.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r2.setBackground(r0)
            goto L45
        La8:
            r2 = r4
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem.op(com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem, X.0yPx):void");
    }

    public final boolean Bp(InterfaceC1856750yPx interfaceC1856750yPx, int i) {
        String strLJJIJLIJ;
        String str = this.LLLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (interfaceC1856750yPx != null) {
            strLJJIJLIJ = interfaceC1856750yPx.LJJIJLIJ();
        } else {
            strLJJIJLIJ = null;
        }
        sbLIZ.append(strLJJIJLIJ);
        sbLIZ.append('#');
        sbLIZ.append(i);
        return Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws Throwable {
        up(interfaceC1587906Jp);
    }
}
