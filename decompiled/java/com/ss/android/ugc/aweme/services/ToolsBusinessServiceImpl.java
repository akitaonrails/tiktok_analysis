package com.ss.android.ugc.aweme.services;

import X.AbstractC20656215sG;
import X.AbstractC20660015ss;
import X.AbstractC738140SxQ;
import X.C0P0T;
import X.C11NJ;
import X.C13IQ;
import X.C13LE;
import X.C1617740sCS;
import X.C19582611jU;
import X.C19582711jV;
import X.C19583611je;
import X.C19596011le;
import X.C19596611lk;
import X.C19597111lp;
import X.C19597211lq;
import X.C19597811lw;
import X.C19600611mO;
import X.C19601011mS;
import X.C19EG;
import X.C2344009Gk;
import X.C450820Hm4;
import X.C450840Hm6;
import X.C705930RmZ;
import X.InterfaceC1581620rGC;
import X.InterfaceC1617760sCU;
import X.InterfaceC19578611iq;
import X.InterfaceC19583711jf;
import X.InterfaceC19597711lv;
import X.InterfaceC19625011qK;
import X.InterfaceC19632111rT;
import X.InterfaceC19632811ra;
import X.InterfaceC450850Hm7;
import Y.ACListenerS93S0300000_29;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.assem.TikTokToolsAssem;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkScenario;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS4S1401000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS84S0500000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ToolsBusinessServiceImpl implements IToolsBusinessService {
    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public C13IQ<? extends AbstractC738140SxQ> getTikToktoolsAssem() {
        return C13LE.LIZ(TikTokToolsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public C13IQ<? extends AbstractC738140SxQ> getToolsActivityAssem() {
        return C13LE.LIZ(ToolsActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19632811ra producePollDetailSaveData() {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19632811ra() { // from class: X.11lo
            public C19632711rZ LL;

            @Override // X.InterfaceC19632811ra
            public final C19632711rZ LJ() {
                return this.LL;
            }

            @Override // X.InterfaceC19632811ra
            public final void LIZLLL(C19632711rZ c19632711rZ) {
                this.LL = c19632711rZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public void dismissStoryInnerSocialStickerBubble() {
        C19597111lp.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC1581620rGC getAvApiFragmentObserver(InterfaceC1617760sCU interfaceC1617760sCU) {
        return new C1617740sCS(interfaceC1617760sCU);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceDonationStickerClickListener(final Context context, final C705930RmZ c705930RmZ) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq() { // from class: X.11jY
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                String str;
                String str2;
                String str3;
                String str4;
                InterfaceC19595111lV interfaceC19595111lV;
                Context context2 = context;
                if (context2 == null) {
                    return false;
                }
                C19582611jU c19582611jU = C19582611jU.LIZ;
                C705930RmZ c705930RmZ2 = c705930RmZ;
                c19582611jU.getClass();
                String str5 = "PERCENT";
                try {
                    HashMap map = (HashMap) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.04ZZ
                    }.getType());
                    String str6 = null;
                    if (map != null) {
                        str = (String) map.get("donation_url");
                    } else {
                        str = null;
                    }
                    if (map != null) {
                        str2 = (String) map.get("organization_type");
                    } else {
                        str2 = null;
                    }
                    boolean zEquals = TextUtils.equals(str2, "PERCENT");
                    if (!zEquals) {
                        str5 = "TILTIFY";
                    } else {
                        if (map == null) {
                            str = null;
                        } else {
                            str = (String) map.get("organization_id");
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "test";
                        }
                    }
                    if (map == null) {
                        str3 = null;
                        str4 = null;
                    } else {
                        str3 = (String) map.get("donation_name");
                        str4 = (String) map.get("fundraiser_id");
                    }
                    C19582611jU.LIZ(str5, str3, str4, c705930RmZ2);
                    if (str != null && str.length() != 0) {
                        if (c705930RmZ2 != null && (interfaceC19595111lV = c705930RmZ2.LJIILIIL) != null) {
                            interactStickerStruct.getType();
                            interfaceC19595111lV.LIZIZ(true);
                        }
                        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
                        if (iPlayerManagerService != null) {
                            iPlayerManagerService.LIZ();
                        }
                        if (zEquals) {
                            if (map != null) {
                                str6 = (String) map.get("organization_id");
                            }
                        } else if (map != null) {
                            str6 = (String) map.get("ngo_id");
                        }
                        C19582611jU.LJ(context2, map, c705930RmZ2, str6);
                        return true;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getTopActivity());
                    c1389890mGx.LJIIJ(context2.getString(2131832355));
                    c1389890mGx.LJIIJJI();
                    return true;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    C19582611jU.LIZ("", "", "", c705930RmZ2);
                    C2344809Gs.LJI(e);
                    return true;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceLocationStickerClickListener(final Context context, final C705930RmZ c705930RmZ) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq() { // from class: X.11jT
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                if (context == null) {
                    return false;
                }
                C1367960lha.LIZ.getClass();
                if (!C1367960lha.LIZ().LJIL()) {
                    return false;
                }
                C19582611jU c19582611jU = C19582611jU.LIZ;
                Context context2 = context;
                C705930RmZ c705930RmZ2 = c705930RmZ;
                c19582611jU.getClass();
                C19582611jU.LIZLLL(context2, interactStickerStruct, c705930RmZ2);
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceSharedCommentStickerListener(C19EG c19eg, Aweme aweme) {
        C19582611jU.LIZ.getClass();
        return new C19596611lk(c19eg, aweme);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public AbstractC20656215sG getRestoreWorkPopTask(final String str, final C19EG c19eg, final LifecycleOwner lifecycleOwner) {
        return new AbstractC20660015ss<Dialog>(str, c19eg, lifecycleOwner) { // from class: X.0s0D
            public final String LL;
            public final C19EG LLILLJJLI;
            public final LifecycleOwner LLILLL;
            public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(509));
            public final int LLILZIL = 250;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LLILLJJLI;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILZIL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                if (!C1593730rZj.LIZIZ.LJIIIZ()) {
                    return null;
                }
                return ((IExternalService) this.LLILZ.getValue()).publishService().showRestoreWorkDialog(this.LLILLJJLI, this.LLILLL, this.LL);
            }

            {
                this.LL = str;
                this.LLILLJJLI = c19eg;
                this.LLILLL = lifecycleOwner;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceCommentStickerClickListener(final Context context, final C705930RmZ c705930RmZ, final C19EG c19eg) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq() { // from class: X.11jb
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                if (MethodIDManager.LJI(72105)) {
                    MethodIDManager.LJ();
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                String str;
                String str2;
                String str3;
                String str4;
                boolean z;
                String strValueOf;
                String str5;
                VideoReplyStruct videoReplyStruct;
                VideoReplyStruct videoReplyStruct2;
                C0R60 c0r60;
                C0R60 c0r602;
                C0R60 c0r603;
                C0R60 c0r604;
                InterfaceC19595111lV interfaceC19595111lV;
                boolean zLJI = MethodIDManager.LJI(72105);
                final C259800zU c259800zU = new C259800zU();
                C19582611jU c19582611jU = C19582611jU.LIZ;
                C19EG c19eg2 = c19eg;
                int type = interactStickerStruct.getType();
                final Context context2 = context;
                final C19EG c19eg3 = c19eg;
                final C705930RmZ c705930RmZ2 = c705930RmZ;
                C19582711jV c19582711jV = new C19582711jV(type, pointF, new InterfaceC19583711jf() { // from class: X.11jg
                    @Override // X.InterfaceC19583711jf
                    public final List<InterfaceC450850Hm7> actions() {
                        String string;
                        VideoReplyStruct videoReplyStruct3;
                        Integer collectStat;
                        String string2;
                        String str6 = "";
                        if (!C2553009zU.LIZ) {
                            Context context3 = context2;
                            if (context3 != null && (string = context3.getString(2131829230)) != null) {
                                str6 = string;
                            }
                            return Collections.singletonList(C19583611je.LIZ(str6, new AwS273S0300000_29(c19eg3, (C19EG) c705930RmZ2, (C705930RmZ) c259800zU, (C259800zU<C0P0T>) 8)));
                        }
                        C450840Hm6[] c450840Hm6Arr = new C450840Hm6[1];
                        Context context4 = context2;
                        if (context4 != null && (string2 = context4.getString(2131829228)) != null) {
                            str6 = string2;
                        }
                        int iIntValue = 0;
                        c450840Hm6Arr[0] = LIZ(str6, R.raw.icon_color_comment_shadow_alt_3, null, new AwS273S0300000_29(c19eg3, (C19EG) c705930RmZ2, (C705930RmZ) c259800zU, (C259800zU<C0P0T>) 7));
                        List<InterfaceC450850Hm7> listLJIILJJIL = C1697810uHb.LJIILJJIL(c450840Hm6Arr);
                        C705930RmZ c705930RmZ3 = c705930RmZ2;
                        C19EG c19eg4 = c19eg3;
                        C259800zU<C0P0T> c259800zU2 = c259800zU;
                        if (c705930RmZ3 != null && (videoReplyStruct3 = c705930RmZ3.LJIJ) != null && (collectStat = videoReplyStruct3.getCollectStat()) != null) {
                            iIntValue = collectStat.intValue();
                        }
                        if (C1206710hVV.LIZIZ() && c705930RmZ3 != null && c705930RmZ3.LJIJ != null && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                            C450840Hm6 c450840Hm6 = new C450840Hm6();
                            VideoReplyStruct videoReplyStruct4 = c705930RmZ3.LJIJ;
                            Long lValueOf = videoReplyStruct4 != null ? Long.valueOf(videoReplyStruct4.getCommentId()) : null;
                            int iLIZ = lValueOf != null ? CommentFavoriteServiceImpl.LIZJ().LIZ(lValueOf.toString()) : -1;
                            if ((iIntValue == 1 && iLIZ == -1) || iLIZ == 1) {
                                c450840Hm6.LIZLLL = c19eg4.getString(2131834428);
                                c450840Hm6.LIZ = R.raw.icon_bookmark_fill;
                                c450840Hm6.LIZIZ = R.attr.ee;
                                c450840Hm6.LJFF = new ACListenerS93S0300000_29(c19eg4, c705930RmZ3, c259800zU2, 0);
                            } else if ((iIntValue == 0 && iLIZ == -1) || iLIZ == 0) {
                                if (C1206710hVV.LIZ()) {
                                    c450840Hm6.LIZLLL = c19eg4.getString(2131834425);
                                } else {
                                    c450840Hm6.LIZLLL = c19eg4.getString(2131834426);
                                }
                                c450840Hm6.LIZ = R.raw.icon_bookmark;
                                c450840Hm6.LIZIZ = R.attr.ee;
                                c450840Hm6.LJFF = new ACListenerS93S0300000_29(c19eg4, c705930RmZ3, c259800zU2, 1);
                            }
                            listLJIILJJIL.add(c450840Hm6);
                        }
                        C19582611jU.LIZ.getClass();
                        return listLJIILJJIL;
                    }

                    public static final C450840Hm6 LIZ(String str6, int i, Integer num, Function0<Unit> function0) {
                        return C19583611je.LIZIZ(str6, R.raw.icon_color_comment_shadow_alt_3, num, function0);
                    }
                }, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 229));
                AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
                c19582611jU.getClass();
                C19582611jU.LJFF(c19eg2, c19582711jV, aFwS273S0000000_29);
                C705930RmZ c705930RmZ3 = c705930RmZ;
                if (c705930RmZ3 != null && (interfaceC19595111lV = c705930RmZ3.LJIILIIL) != null) {
                    interactStickerStruct.getType();
                    interfaceC19595111lV.LIZIZ(true);
                }
                C705930RmZ c705930RmZ4 = c705930RmZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                Long lValueOf = null;
                if (c705930RmZ4 != null && (c0r604 = c705930RmZ4.LJIIZILJ) != null) {
                    str = c0r604.LIZLLL;
                } else {
                    str = null;
                }
                c2344009Gk.LJIIIIZZ("group_id", str);
                if (c705930RmZ4 != null && (c0r603 = c705930RmZ4.LJIIZILJ) != null) {
                    str2 = c0r603.LIZJ;
                } else {
                    str2 = null;
                }
                c2344009Gk.LJIIIIZZ("author_id", str2);
                if (c705930RmZ4 != null && (c0r602 = c705930RmZ4.LJIIZILJ) != null) {
                    str3 = c0r602.LJ;
                } else {
                    str3 = null;
                }
                c2344009Gk.LJIIIIZZ("log_pb", str3);
                if (c705930RmZ4 != null && (c0r60 = c705930RmZ4.LJIIZILJ) != null) {
                    str4 = c0r60.LIZ;
                } else {
                    str4 = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                if (c705930RmZ4 != null && (videoReplyStruct2 = c705930RmZ4.LJIJ) != null && videoReplyStruct2.getCommentId() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str6 = "";
                if (z) {
                    strValueOf = "";
                } else {
                    if (c705930RmZ4 != null && (videoReplyStruct = c705930RmZ4.LJIJ) != null) {
                        lValueOf = Long.valueOf(videoReplyStruct.getCommentId());
                    }
                    strValueOf = String.valueOf(lValueOf);
                }
                c2344009Gk.LJIIIIZZ("reply_comment_id", strValueOf);
                if (c705930RmZ4 != null && (str5 = c705930RmZ4.LJIJI) != null) {
                    str6 = str5;
                }
                c2344009Gk.LJIIIIZZ("reply_user_id", str6);
                c2344009Gk.LJIIIIZZ("sticker_type", "comment_reply");
                boolean z2 = C2553009zU.LIZ;
                c2344009Gk.LJIIIIZZ("options_show", "see_comment");
                C20684815ws.LJIILLIIL("sticker_click", c2344009Gk.LIZ);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceAttributionLinkStickerClickListener(final Context context, final C705930RmZ c705930RmZ, final Aweme aweme, C19EG c19eg) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq() { // from class: X.11l7
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                String str;
                int i;
                String str2;
                String str3;
                InterfaceC19595111lV interfaceC19595111lV;
                C0R60 c0r60;
                C0R60 c0r602;
                FragmentManager supportFragmentManager;
                AttributionLinkStickerStruct attributionLinkStickerStruct = interactStickerStruct.getAttributionLinkStickerStruct();
                if (context == null || attributionLinkStickerStruct == null) {
                    return false;
                }
                if (attributionLinkStickerStruct.getScenario() == AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_MUSIC.getValue()) {
                    str = "music";
                } else {
                    str = "link";
                }
                if (attributionLinkStickerStruct.getShareFormat() == AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE.getValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                C19582611jU c19582611jU = C19582611jU.LIZ;
                Context context2 = context;
                Aweme aweme2 = aweme;
                C705930RmZ c705930RmZ2 = c705930RmZ;
                c19582611jU.getClass();
                C1390850mIV c1390850mIV = new C1390850mIV();
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZ = context2.getString(2131832471, attributionLinkStickerStruct.getTitle());
                c1247510iZJ.LIZ(new AwS4S1401000_19(i, context2, attributionLinkStickerStruct, aweme2, c705930RmZ2, str, 0));
                c1390850mIV.LIZIZ(c1247510iZJ);
                TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    tuxActionSheetLIZJ.show(supportFragmentManager, "dsp link action sheet");
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                C705930RmZ c705930RmZ3 = c705930RmZ;
                String idStr = null;
                if (c705930RmZ3 != null && (c0r602 = c705930RmZ3.LJIIZILJ) != null) {
                    str2 = c0r602.LIZ;
                } else {
                    str2 = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                C705930RmZ c705930RmZ4 = c705930RmZ;
                if (c705930RmZ4 != null && (c0r60 = c705930RmZ4.LJIIZILJ) != null) {
                    str3 = c0r60.LIZLLL;
                } else {
                    str3 = null;
                }
                c2344009Gk.LJIIIIZZ("group_id", str3);
                c2344009Gk.LJIIIIZZ("channel", str);
                c2344009Gk.LIZJ(i, "is_photo");
                Music music = aweme.getMusic();
                if (music != null) {
                    idStr = music.getIdStr();
                }
                c2344009Gk.LJIIIIZZ("music_id", idStr);
                c2344009Gk.LJIIIIZZ("shared_dsp", attributionLinkStickerStruct.getTitle());
                C20684815ws.LJIILLIIL("link_share_click", c2344009Gk.LIZ);
                C705930RmZ c705930RmZ5 = c705930RmZ;
                if (c705930RmZ5 != null && (interfaceC19595111lV = c705930RmZ5.LJIILIIL) != null) {
                    interactStickerStruct.getType();
                    interfaceC19595111lV.LIZIZ(true);
                    return true;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceLiveCountDownStickerClickListener(final Context context, final C705930RmZ c705930RmZ, final Aweme aweme, final C19EG c19eg) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq(context, c705930RmZ, aweme, c19eg) { // from class: X.0SSU
            public final Context LL;
            public final C705930RmZ LLILLJJLI;
            public final Aweme LLILLL;
            public final C19EG LLILZ;
            public FeedCountStickerDialogFragment LLILZIL;

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                FeedCountStickerDialogFragment feedCountStickerDialogFragment;
                C19FO c19fo;
                Lifecycle lifecycle;
                Lifecycle.State currentState;
                String str;
                String str2;
                String str3;
                long j;
                String str4;
                C0R60 c0r60;
                C0R60 c0r602;
                C0R60 c0r603;
                FeedCountStickerDialogFragment feedCountStickerDialogFragment2;
                String str5;
                String str6;
                String str7;
                C0R60 c0r604;
                C0R60 c0r605;
                C0R60 c0r606;
                String authorUid = null;
                if (this.LLILZIL == null) {
                    CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                    Aweme aweme2 = this.LLILLL;
                    C705930RmZ c705930RmZ2 = this.LLILLJJLI;
                    if (countDownStickerStruct == null) {
                        feedCountStickerDialogFragment2 = null;
                    } else {
                        feedCountStickerDialogFragment2 = new FeedCountStickerDialogFragment();
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJIZ(bundle, "countdown_sticker_data", countDownStickerStruct);
                        C786410Ut5.LJJIZ(bundle, "countdown_sticker_aweme", aweme2);
                        if (c705930RmZ2 != null && (c0r606 = c705930RmZ2.LJIIZILJ) != null) {
                            str5 = c0r606.LIZLLL;
                        } else {
                            str5 = null;
                        }
                        C786410Ut5.LJJJI("group_id", str5, bundle);
                        if (c705930RmZ2 != null && (c0r605 = c705930RmZ2.LJIIZILJ) != null) {
                            str6 = c0r605.LIZJ;
                        } else {
                            str6 = null;
                        }
                        C786410Ut5.LJJJI("author_id", str6, bundle);
                        if (c705930RmZ2 != null && (c0r604 = c705930RmZ2.LJIIZILJ) != null) {
                            str7 = c0r604.LIZ;
                        } else {
                            str7 = null;
                        }
                        C786410Ut5.LJJJI("enter_from", str7, bundle);
                        feedCountStickerDialogFragment2.setArguments(bundle);
                    }
                    this.LLILZIL = feedCountStickerDialogFragment2;
                }
                this.LLILZ.getSupportFragmentManager().LJJJJL();
                FeedCountStickerDialogFragment feedCountStickerDialogFragment3 = this.LLILZIL;
                if ((feedCountStickerDialogFragment3 != null && feedCountStickerDialogFragment3.isAdded()) || ((feedCountStickerDialogFragment = this.LLILZIL) != null && feedCountStickerDialogFragment.isVisible())) {
                    return false;
                }
                FeedCountStickerDialogFragment feedCountStickerDialogFragment4 = this.LLILZIL;
                if (feedCountStickerDialogFragment4 != null && feedCountStickerDialogFragment4.isRemoving()) {
                    return false;
                }
                Activity activityLIZ = C06MM.LIZ(this.LL);
                if ((activityLIZ instanceof C19GS) && (c19fo = (C19FO) activityLIZ) != null && (lifecycle = c19fo.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                    FeedCountStickerDialogFragment feedCountStickerDialogFragment5 = this.LLILZIL;
                    if (feedCountStickerDialogFragment5 != null) {
                        feedCountStickerDialogFragment5.showNow(this.LLILZ.getSupportFragmentManager(), "FeedCountDownStickerDialogFragment");
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C705930RmZ c705930RmZ3 = this.LLILLJJLI;
                    if (c705930RmZ3 != null && (c0r603 = c705930RmZ3.LJIIZILJ) != null) {
                        str = c0r603.LIZLLL;
                    } else {
                        str = null;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", str);
                    C705930RmZ c705930RmZ4 = this.LLILLJJLI;
                    if (c705930RmZ4 != null && (c0r602 = c705930RmZ4.LJIIZILJ) != null) {
                        str2 = c0r602.LIZJ;
                    } else {
                        str2 = null;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", str2);
                    C705930RmZ c705930RmZ5 = this.LLILLJJLI;
                    if (c705930RmZ5 != null && (c0r60 = c705930RmZ5.LJIIZILJ) != null) {
                        str3 = c0r60.LIZ;
                    } else {
                        str3 = null;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str3);
                    CountDownStickerStruct countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
                    long millSecond = 0;
                    if (countDownStickerStruct2 != null && countDownStickerStruct2.getMillSecond() - System.currentTimeMillis() > 0) {
                        if (countDownStickerStruct2 != null) {
                            millSecond = countDownStickerStruct2.getMillSecond() - System.currentTimeMillis();
                        }
                        j = millSecond / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    } else {
                        j = -1;
                    }
                    c2344009Gk.LIZLLL(j, "countdown_time");
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    Aweme aweme3 = this.LLILLL;
                    if (aweme3 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme3);
                    }
                    c2344009Gk.LIZJ(TextUtils.equals(curUserId, authorUid) ? 1 : 0, "is_author");
                    C705930RmZ c705930RmZ6 = this.LLILLJJLI;
                    if (c705930RmZ6 == null || (str4 = c705930RmZ6.LJFF) == null) {
                        str4 = "";
                    }
                    c2344009Gk.LJIIIIZZ("enter_method", str4);
                    C20684815ws.LJIILLIIL("livesdk_cd_layer_show", c2344009Gk.LIZ);
                    return false;
                }
                return false;
            }

            {
                this.LL = context;
                this.LLILLJJLI = c705930RmZ;
                this.LLILLL = aweme;
                this.LLILZ = c19eg;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceMusicStickerClickListener(final Context context, final C705930RmZ c705930RmZ, final Aweme aweme, final C19EG c19eg) {
        C19582611jU.LIZ.getClass();
        return new InterfaceC19578611iq() { // from class: X.11jc
            @Override // X.InterfaceC19578611iq
            public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                return false;
            }

            @Override // X.InterfaceC19578611iq
            public final boolean onClick(final InteractStickerStruct interactStickerStruct, PointF pointF) {
                String str;
                String groupId;
                String authorUid;
                InterfaceC19595111lV interfaceC19595111lV;
                C0R60 c0r60;
                if (context != null) {
                    C1398440mUk.LIZ.getClass();
                    if (C1398440mUk.LIZ()) {
                        final C259800zU c259800zU = new C259800zU();
                        C19582611jU c19582611jU = C19582611jU.LIZ;
                        C19EG c19eg2 = c19eg;
                        int type = interactStickerStruct.getType();
                        final Context context2 = context;
                        final C705930RmZ c705930RmZ2 = c705930RmZ;
                        final Aweme aweme2 = aweme;
                        C19582711jV c19582711jV = new C19582711jV(type, pointF, new InterfaceC19583711jf() { // from class: X.11jd
                            @Override // X.InterfaceC19583711jf
                            public final List<InterfaceC450850Hm7> actions() {
                                C1398440mUk.LIZ.getClass();
                                boolean zLIZIZ = C1398440mUk.LIZIZ();
                                Integer numValueOf = Integer.valueOf(R.attr.ee);
                                return zLIZIZ ? Collections.singletonList(C19583611je.LIZIZ(context2.getString(2131837728), R.raw.icon_camera_fill, numValueOf, new AwS84S0500000_29(context2, interactStickerStruct, c705930RmZ2, aweme2, c259800zU, 0))) : Collections.singletonList(C19583611je.LIZIZ(context2.getString(2131837725), R.raw.icon_eye_fill, numValueOf, new AwS84S0500000_29(context2, interactStickerStruct, c705930RmZ2, aweme2, c259800zU, 1)));
                            }
                        }, new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 230));
                        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
                        c19582611jU.getClass();
                        C19582611jU.LJFF(c19eg2, c19582711jV, aFwS273S0000000_29);
                        C705930RmZ c705930RmZ3 = c705930RmZ;
                        Aweme aweme3 = aweme;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        String str2 = null;
                        if (c705930RmZ3 != null && (c0r60 = c705930RmZ3.LJIIZILJ) != null) {
                            str = c0r60.LIZ;
                        } else {
                            str = null;
                        }
                        c2344009Gk.LJIIIIZZ("enter_from", str);
                        if (aweme3 != null) {
                            groupId = aweme3.getGroupId();
                        } else {
                            groupId = null;
                        }
                        c2344009Gk.LJIIIIZZ("group_id", groupId);
                        if (aweme3 != null) {
                            authorUid = AwemeExtKt.getAuthorUid(aweme3);
                        } else {
                            authorUid = null;
                        }
                        c2344009Gk.LJIIIIZZ("author_id", authorUid);
                        MusicStickerStruct musicStickerStruct = interactStickerStruct.getMusicStickerStruct();
                        if (musicStickerStruct != null) {
                            str2 = musicStickerStruct.musicId;
                        }
                        c2344009Gk.LJIIIIZZ("music_id", str2);
                        C20684815ws.LJIILLIIL("music_sticker_click", c2344009Gk.LIZ);
                        C705930RmZ c705930RmZ4 = c705930RmZ;
                        if (c705930RmZ4 != null && (interfaceC19595111lV = c705930RmZ4.LJIILIIL) != null) {
                            interactStickerStruct.getType();
                            interfaceC19595111lV.LIZIZ(true);
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceShare2StoryPhotoStickerClickListener(Context context, C705930RmZ c705930RmZ, final Aweme aweme, C19EG c19eg) {
        aweme.getAid();
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (it2.hasNext() && it2.next().getVideoShareInfoStruct() == null) {
            }
        }
        try {
            return new C19596011le(context, c705930RmZ, aweme, c19eg);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new InterfaceC19578611iq() { // from class: com.ss.android.ugc.aweme.services.ToolsBusinessServiceImpl.produceShare2StoryPhotoStickerClickListener.2
                @Override // X.InterfaceC19578611iq
                public boolean onClick(InteractStickerStruct interactStickerStruct) {
                    return false;
                }

                @Override // X.InterfaceC19578611iq
                public boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                    return false;
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceInteractiveEmojiClickListener(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, Function1<? super String, Unit> function1) {
        C19582611jU.LIZ.getClass();
        if (context == null) {
            return new InterfaceC19578611iq() { // from class: X.11ln
                @Override // X.InterfaceC19578611iq
                public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                    return false;
                }

                @Override // X.InterfaceC19578611iq
                public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                    return false;
                }
            };
        }
        return new C19600611mO(context, c705930RmZ, c19eg, aweme, z, function1);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19625011qK produceLiveEventCountDownStickerListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, boolean z, Function0<String> function0) {
        C19582611jU.LIZ.getClass();
        ILiveEventStickerService iLiveEventStickerService = (ILiveEventStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, false, false, false, 14, null);
        if (iLiveEventStickerService != null) {
            return iLiveEventStickerService.LIZLLL(context, c705930RmZ, aweme, c19eg, z, function0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19632111rT producePollStickerClickListener(boolean z, Context context, C705930RmZ c705930RmZ, C19EG c19eg, InterfaceC19632811ra interfaceC19632811ra, C11NJ c11nj) {
        C19582611jU.LIZ.getClass();
        return new C19597811lw(z, context, c705930RmZ, c19eg, interfaceC19632811ra, c11nj);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceSocialAvatarClickListener(C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, ViewGroup viewGroup, boolean z, FragmentManager fragmentManager) {
        C19582611jU.LIZ.getClass();
        ISocialAvatarStickerCoreService iSocialAvatarStickerCoreService = (ISocialAvatarStickerCoreService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStickerCoreService.class, false, false, false, 14, null);
        if (iSocialAvatarStickerCoreService != null) {
            return iSocialAvatarStickerCoreService.LIZ(c705930RmZ, c19eg, aweme, viewGroup, z, fragmentManager);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public void showTip(final C19EG c19eg, InteractStickerStruct interactStickerStruct, PointF pointF, final int i, Function1<? super C0P0T, Unit> function1, final Function0<Unit> function0) {
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19582711jV c19582711jV = new C19582711jV(interactStickerStruct.getType(), pointF, new InterfaceC19583711jf() { // from class: com.ss.android.ugc.aweme.services.ToolsBusinessServiceImpl.showTip.1
            @Override // X.InterfaceC19583711jf
            public List<InterfaceC450850Hm7> actions() {
                C450820Hm4 c450820Hm4CreateBaseArrowAction = createBaseArrowAction(c19eg.getString(i), new AwS573S0100000_29(function0, (Function0<? extends Banner>) 192));
                c450820Hm4CreateBaseArrowAction.getClass();
                return Collections.singletonList(c450820Hm4CreateBaseArrowAction);
            }

            public C450820Hm4 createBaseArrowAction(String str, Function0<Unit> function02) {
                return C19583611je.LIZ(str, function02);
            }

            public C450840Hm6 createBaseMenuAction(String str, int i2, Integer num, Function0<Unit> function02) {
                return C19583611je.LIZIZ(str, i2, num, function02);
            }
        }, function1);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(138);
        c19582611jU.getClass();
        C19582611jU.LJFF(c19eg, c19582711jV, aFwS273S0000000_29);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceSocialStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, Function2<? super C2344009Gk, ? super Aweme, Unit> function2, InterfaceC19597711lv interfaceC19597711lv, boolean z) {
        C19582611jU.LIZ.getClass();
        return new C19597211lq(context, c705930RmZ, aweme, c19eg, function2, interfaceC19597711lv, z);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC19578611iq produceEmojiSliderGestureListener(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, ViewGroup viewGroup, Function1<? super Boolean, Unit> function1, boolean z2) {
        C19582611jU.LIZ.getClass();
        if (context == null) {
            return new InterfaceC19578611iq() { // from class: X.11lm
                @Override // X.InterfaceC19578611iq
                public final boolean onClick(InteractStickerStruct interactStickerStruct) {
                    return false;
                }

                @Override // X.InterfaceC19578611iq
                public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
                    return false;
                }
            };
        }
        return new C19601011mS(context, c705930RmZ, c19eg, aweme, z, viewGroup, function1, z2);
    }
}
