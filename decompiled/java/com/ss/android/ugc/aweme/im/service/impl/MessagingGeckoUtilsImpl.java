package com.ss.android.ugc.aweme.im.service.impl;

import X.C098200Yq;
import X.C1446005lK;
import X.C1446205lM;
import X.C1553670qX7;
import X.C189200o6;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.service.gecko.MessagingGeckoUtils;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingGeckoUtilsImpl implements MessagingGeckoUtils {
    public final Function2<String, String, String> LIZIZ;
    public final Function1<String, Boolean> LIZJ;
    public final String LIZLLL;
    public final Function1<String, File> LJ;

    public MessagingGeckoUtilsImpl() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.im.service.gecko.MessagingGeckoUtils
    public final boolean LIZIZ() {
        return this.LIZJ.invoke("tt_messaging_mt_emoji_zip").booleanValue();
    }

    public MessagingGeckoUtilsImpl(Object obj) {
        C1446205lM c1446205lM = C1446205lM.LL;
        C1446005lK c1446005lK = C1446005lK.LL;
        String strLIZ = C1553670qX7.LIZ();
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(883);
        this.LIZIZ = c1446205lM;
        this.LIZJ = c1446005lK;
        this.LIZLLL = strLIZ;
        this.LJ = aFwS229S0000000_2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.gecko.MessagingGeckoUtils
    public final Object LIZ(String str) {
        if (!LIZIZ()) {
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("GeckoEmojiUtils: gecko small emoji not loaded yet"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        String strInvoke = this.LIZIZ.invoke(this.LIZLLL, "tt_messaging_mt_emoji_zip");
        if (strInvoke != null && strInvoke.length() != 0) {
            Function1<String, File> function1 = this.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strInvoke);
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            File fileInvoke = function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
            if (!fileInvoke.exists()) {
                C098200Yq c098200Yq2 = new C098200Yq(new IllegalStateException("GeckoEmojiUtils: emoji file does not exist"));
                C189200o6.m2constructorimpl(c098200Yq2);
                return c098200Yq2;
            }
            String absolutePath = fileInvoke.getAbsolutePath();
            C189200o6.m2constructorimpl(absolutePath);
            return absolutePath;
        }
        C098200Yq c098200Yq3 = new C098200Yq(new IllegalStateException("GeckoEmojiUtils: invalid parent channel path"));
        C189200o6.m2constructorimpl(c098200Yq3);
        return c098200Yq3;
    }
}
