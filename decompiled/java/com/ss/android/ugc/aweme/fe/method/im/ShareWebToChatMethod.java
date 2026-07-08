package com.ss.android.ugc.aweme.fe.method.im;

import X.C0U3R;
import X.C1370940lmO;
import X.C1599690rjL;
import X.C2214201BlK;
import X.C2344809Gs;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import X.InterfaceC1365380ldQ;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.share.ImWebSharePackage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareWebToChatMethod extends BaseCommonJavaMethod {
    public ShareWebToChatMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) {
        IMContact iMContact;
        if (jSONObject == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "no params found");
                return;
            }
            return;
        }
        int iOptInt = jSONObject.optInt("type");
        if (iOptInt != 1) {
            if (iOptInt != 2) {
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(0, "unknown type");
                    return;
                }
                return;
            } else {
                String strOptString = jSONObject.optString("cid");
                IMConversation iMConversation = new IMConversation();
                iMConversation.setConversationId(strOptString);
                iMContact = iMConversation;
            }
        } else {
            String strOptString2 = jSONObject.optString("uid");
            IMUser iMUser = new IMUser();
            iMUser.setUid(strOptString2);
            iMContact = iMUser;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "activity is null");
                return;
            }
            return;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "title");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "desc");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "pic_url");
            String string4 = JSONObjectProtectorUtils.getString(jSONObject, "web_url");
            String strOptString3 = jSONObject.optString("enter_from");
            String strOptString4 = jSONObject.optString("message_type");
            C2344809Gs.LIZLLL(4, "ShareWebToChatMethod", "start to share ");
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "web";
            c1370940lmO.LIZLLL = string;
            c1370940lmO.LJ = string2;
            c1370940lmO.LJFF = string4;
            C786410Ut5.LJJJI("enter_from", strOptString3, c1370940lmO.LJII);
            C786410Ut5.LJJJI("message_type", strOptString4, c1370940lmO.LJII);
            ImWebSharePackage imWebSharePackage = new ImWebSharePackage(c1370940lmO);
            imWebSharePackage.imagePath = string3;
            imWebSharePackage.needImTips = false;
            C786410Ut5.LJJJI("thumb_url", string3, imWebSharePackage.extras);
            shareService.LJJIJIL(activityLJFF, iMContact, imWebSharePackage, new C0U3R() { // from class: X.0lwk
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.C0U3R
                public final void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("success ");
                    sbLIZ.append(bool);
                    C2344809Gs.LIZLLL(4, "ShareWebToChatMethod", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                    if (interfaceC1041760dDS2 != null) {
                        interfaceC1041760dDS2.LIZJ(bool.booleanValue() ? 1 : 0, null, "callback");
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "catch exception:" + e.getMessage());
            }
        }
    }
}
