package com.ss.android.ugc.aweme.commentv2.headeranchor.common;

import X.C01GW;
import X.C123100dR;
import X.C1345700l7g;
import X.C1350470lFN;
import X.C1350500lFQ;
import X.C1350920lG6;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C724240Sb0;
import X.C726120Se2;
import X.C733302tf;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.component.CommonTopBarView;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentLifeCycleTrigger;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS54S0500000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class CommentCommonTopBarAssem extends UISlotAssem implements ICommentPageVisibilityProtocol, ICommentPageReusedProtocol, ICommentTopBarAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public CommentTopBarComponent LLJJIII;
    public CommonTopBarView LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public boolean LLJJJ;
    public Aweme LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentCommonTopBarAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.agw;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        onVisibilityChanged(true);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        onVisibilityChanged(false);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
        this.LLJJJ = true;
        kp(false);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
        if (this.LLJJJ) {
            kp(true);
        }
        this.LLJJJ = false;
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        super.onDestroy();
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null) {
            C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            Aweme aweme = CommentContextSourceKt.aweme(ip());
            CommentContextSource commentContextSourceIp = ip();
            c1350500lFQ.getClass();
            Integer num = commentTopBarComponent.bizType;
            if (num != null && (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num.intValue())) != null) {
                iCommentTopBarImplementServiceLIZLLL.onUnBindComponentView(c19egLIZ, fragmentLJI, commentTopBarComponent, aweme, commentContextSourceIp);
            }
        }
        this.LLJJIII = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, ICommentTopBarAbility.class, null, null);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLJJJJJIL = Intrinsics.LJFF(interfaceC665370Q7zLJIL, c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJJJJIL;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (!C295880Bik.LIZLLL || !C295780Bia.LIZIZ) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (!C1356320lOo.LIZ(Co())) {
                super.Eo(context);
                return context;
            }
        }
        return LJJIJL().getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022c  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v40, types: [com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService] */
    /* JADX WARN: Type inference failed for: r3v44, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r5v24, types: [T, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent] */
    /* JADX WARN: Type inference failed for: r5v47, types: [com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon] */
    /* JADX WARN: Type inference failed for: r5v49, types: [com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.Context] */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bT(com.ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            Method dump skipped, instruction units count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.headeranchor.common.CommentCommonTopBarAssem.bT(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void kp(boolean z) {
        String str;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL;
        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL2;
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAnchorLifecycleChanged componentTag = ");
            CommentTopBarComponent commentTopBarComponent2 = this.LLJJIII;
            if (commentTopBarComponent2 != null) {
                str = commentTopBarComponent2.name;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                Aweme aweme = CommentContextSourceKt.aweme(ip());
                CommentContextSource commentContextSourceIp = ip();
                c1350500lFQ.getClass();
                Integer num = commentTopBarComponent.bizType;
                if (num != null && (iCommentTopBarImplementServiceLIZLLL2 = C1350500lFQ.LIZLLL(num.intValue())) != null) {
                    iCommentTopBarImplementServiceLIZLLL2.onResumeShow(c19egLIZ, fragmentLJI, commentTopBarComponent, aweme, commentContextSourceIp);
                    return;
                }
                return;
            }
            C1350500lFQ c1350500lFQ2 = C1350500lFQ.LIZ;
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            Aweme aweme2 = CommentContextSourceKt.aweme(ip());
            CommentContextSource commentContextSourceIp2 = ip();
            c1350500lFQ2.getClass();
            Integer num2 = commentTopBarComponent.bizType;
            if (num2 == null || (iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(num2.intValue())) == null) {
                return;
            }
            iCommentTopBarImplementServiceLIZLLL.onPause(c19egLIZ2, fragmentLJI2, commentTopBarComponent, aweme2, commentContextSourceIp2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CommentCommonModel commonModel;
        super.onViewCreated(view);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.eem);
        this.LLJJIJIL = (ViewGroup) view.findViewById(R.id.eab);
        CommentContextSource commentContextSourceIp = ip();
        if (commentContextSourceIp != null && (commonModel = commentContextSourceIp.getCommonModel()) != null && commonModel.isPreCreate()) {
            return;
        }
        bT(null);
    }

    public final void onVisibilityChanged(boolean z) {
        String str;
        ICommentLifeCycleTrigger iCommentLifeCycleTrigger;
        Aweme aweme;
        ICommentLifeCycleTrigger iCommentLifeCycleTrigger2;
        String str2;
        HashMap map;
        String str3;
        String str4;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        HashMap<String, String> mapAppendShowEventParams;
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null) {
            Aweme aweme2 = null;
            if (z) {
                CommentContextSource commentContextSourceIp = ip();
                if (commentContextSourceIp != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
                } else {
                    aweme = null;
                }
                CommentContextSource commentContextSourceIp2 = ip();
                CommentTopBarComponent commentTopBarComponent2 = this.LLJJIII;
                if (commentTopBarComponent2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onAnchorShow componentTag = ");
                    CommentTopBarComponent commentTopBarComponent3 = this.LLJJIII;
                    if (commentTopBarComponent3 != null) {
                        str2 = commentTopBarComponent3.name;
                    } else {
                        str2 = null;
                    }
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1350500lFQ c1350500lFQ = C1350500lFQ.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    Aweme aweme3 = CommentContextSourceKt.aweme(ip());
                    CommentContextSource commentContextSourceIp3 = ip();
                    c1350500lFQ.getClass();
                    C1350500lFQ.LJI(c19egLIZ, fragmentLJI, commentTopBarComponent2, aweme3, commentContextSourceIp3);
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                    Aweme aweme4 = CommentContextSourceKt.aweme(ip());
                    CommentContextSource commentContextSourceIp4 = ip();
                    Integer num = commentTopBarComponent2.bizType;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        map = new HashMap();
                        ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL = C1350500lFQ.LIZLLL(iIntValue);
                        if (iCommentTopBarImplementServiceLIZLLL != null && (mapAppendShowEventParams = iCommentTopBarImplementServiceLIZLLL.appendShowEventParams(c19egLIZ2, fragmentLJI2, commentTopBarComponent2, aweme4, commentContextSourceIp4)) != null) {
                            for (Map.Entry<String, String> entry : mapAppendShowEventParams.entrySet()) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } else {
                        map = null;
                    }
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    if (commentContextSourceIp2 != null && (commonModel2 = commentContextSourceIp2.getCommonModel()) != null) {
                        str3 = commonModel2.eventType;
                    } else {
                        str3 = null;
                    }
                    c1350920lG6.getClass();
                    C1350920lG6.LJLJI(commentTopBarComponent2, str3, aweme, map);
                    String str5 = commentTopBarComponent2.name;
                    if (str5 != null) {
                        if (commentContextSourceIp2 != null && (commonModel = commentContextSourceIp2.getCommonModel()) != null) {
                            str4 = commonModel.eventType;
                        } else {
                            str4 = null;
                        }
                        C1350920lG6.LJLIIIL(aweme, "comment_top_component_show", str5, str4, hp(commentTopBarComponent2, map));
                    }
                }
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 != null) {
                    Object service = ServiceManager.get().getService(ICommentTopBarAbilityService.class);
                    if ((service instanceof ICommentLifeCycleTrigger) && (iCommentLifeCycleTrigger2 = (ICommentLifeCycleTrigger) service) != null) {
                        CommentContextSource commentContextSourceIp5 = ip();
                        if (commentContextSourceIp5 != null) {
                            aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp5);
                        }
                        iCommentLifeCycleTrigger2.onTriggerCommentTopBarShow(fragmentLJI3, aweme2, ip(), commentTopBarComponent);
                        return;
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAnchorHide componentTag = ");
            CommentTopBarComponent commentTopBarComponent4 = this.LLJJIII;
            if (commentTopBarComponent4 != null) {
                str = commentTopBarComponent4.name;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1350500lFQ c1350500lFQ2 = C1350500lFQ.LIZ;
            C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
            Fragment fragmentLJI4 = C724240Sb0.LJI(this);
            Aweme aweme5 = CommentContextSourceKt.aweme(ip());
            CommentContextSource commentContextSourceIp6 = ip();
            c1350500lFQ2.getClass();
            Integer num2 = commentTopBarComponent.bizType;
            if (num2 != null) {
                ICommentTopBarImplementService iCommentTopBarImplementServiceLIZLLL2 = C1350500lFQ.LIZLLL(num2.intValue());
                if (iCommentTopBarImplementServiceLIZLLL2 != null) {
                    iCommentTopBarImplementServiceLIZLLL2.onComponentHide(c19egLIZ3, fragmentLJI4, commentTopBarComponent, aweme5, commentContextSourceIp6);
                }
                AwS54S0500000_21 awS54S0500000_21 = new AwS54S0500000_21(c19egLIZ3, fragmentLJI4, commentTopBarComponent, aweme5, commentContextSourceIp6, 2);
                commentTopBarComponent = commentTopBarComponent;
                C1350500lFQ.LIZJ(c19egLIZ3, fragmentLJI4, commentTopBarComponent, aweme5, commentContextSourceIp6, awS54S0500000_21);
            }
            Fragment fragmentLJI5 = C724240Sb0.LJI(this);
            if (fragmentLJI5 != null) {
                Object service2 = ServiceManager.get().getService(ICommentTopBarAbilityService.class);
                if ((service2 instanceof ICommentLifeCycleTrigger) && (iCommentLifeCycleTrigger = (ICommentLifeCycleTrigger) service2) != null) {
                    CommentContextSource commentContextSourceIp7 = ip();
                    if (commentContextSourceIp7 != null) {
                        aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp7);
                    }
                    iCommentLifeCycleTrigger.onTriggerCommentTopBarHide(fragmentLJI5, aweme2, ip(), commentTopBarComponent);
                }
            }
        }
    }

    public static HashMap hp(CommentTopBarComponent commentTopBarComponent, Map map) {
        String string;
        HashMap map2 = new HashMap();
        String str = commentTopBarComponent.tracerInfo;
        if (!C123100dR.LIZ(str)) {
            str = null;
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt == null || (string = objOpt.toString()) == null) {
                        string = "";
                    }
                    map2.put(next, string);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility
    public final void uh2(int i, String str) {
        Integer num;
        Aweme aweme;
        Aweme aweme2;
        String aid;
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null && (num = commentTopBarComponent.bizType) != null && num.intValue() == i && Intrinsics.LJFF(commentTopBarComponent.bizId, str)) {
            C1350470lFN c1350470lFN = C1350470lFN.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            CommentContextSource commentContextSourceIp = ip();
            if (commentContextSourceIp != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSourceIp2 = ip();
            c1350470lFN.getClass();
            if (C1350470lFN.LIZIZ(c19egLIZ, aweme, commentContextSourceIp2, commentTopBarComponent, false) != 0) {
                CommentContextSource commentContextSourceIp3 = ip();
                if (commentContextSourceIp3 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp3)) != null && (aid = aweme2.getAid()) != null) {
                    C1350470lFN.LIZLLL.remove(aid);
                    C1350470lFN.LJ.remove(aid);
                }
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                this.LLJJIII = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility
    public final void bf1(int i, String str, Aweme aweme, CommentTopBarText commentTopBarText, CommentTopBarText commentTopBarText2, CommentTopBarText commentTopBarText3, CommentTopBarText commentTopBarText4, CommentTopBarText commentTopBarText5, CommentTopBarText commentTopBarText6, CommentTopBarText commentTopBarText7) {
        Integer num;
        String aid;
        Aweme aweme2;
        CommentTopBarComponent commentTopBarComponent = this.LLJJIII;
        if (commentTopBarComponent != null && (num = commentTopBarComponent.bizType) != null && num.intValue() == i && Intrinsics.LJFF(commentTopBarComponent.bizId, str)) {
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            CommentContextSource commentContextSourceIp = ip();
            if (commentContextSourceIp != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp)) != null) {
                aid2 = aweme2.getAid();
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                if (commentTopBarText != null) {
                    commentTopBarComponent.setTitle(commentTopBarText);
                }
                if (commentTopBarText2 != null) {
                    commentTopBarComponent.setTitlePrefix(commentTopBarText2);
                }
                if (commentTopBarText3 != null) {
                    commentTopBarComponent.setTitleSeparator(commentTopBarText3);
                }
                if (commentTopBarText4 != null) {
                    commentTopBarComponent.setDescPrefix(commentTopBarText4);
                }
                if (commentTopBarText5 != null) {
                    commentTopBarComponent.setSeparator(commentTopBarText5);
                }
                if (commentTopBarText6 != null) {
                    commentTopBarComponent.setDescSuffix(commentTopBarText6);
                }
                if (commentTopBarText7 != null) {
                    commentTopBarComponent.setDescTail(commentTopBarText7);
                }
                C733302tf.LIZJ(commentTopBarComponent);
                CommonTopBarView commonTopBarView = this.LLJJIJI;
                if (commonTopBarView != null) {
                    commonTopBarView.LIZJ(commentTopBarComponent.title, commentTopBarComponent.titleSeparator, commentTopBarComponent.titlePrefix);
                    commonTopBarView.LIZIZ(commentTopBarComponent.descPrefix, commentTopBarComponent.descSuffix, commentTopBarComponent.separator, commentTopBarComponent.tailIcon, commentTopBarComponent.descTail);
                }
            }
        }
    }
}
