package com.ss.android.ugc.aweme.feed.model.ad;

import X.C08FF;
import X.C098200Yq;
import X.C09C2;
import X.C09CT;
import X.C189200o6;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideTriggerCondition implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 1;

    @C09CT("dialog_config")
    public final Map<String, AdExternalGuideDialogConfig> dialogConfig;

    @C09CT("params")
    public final k params;

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("type")
    public final Integer type;

    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Scene {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Scene[] $VALUES;
        public final int value;
        public static final Scene UNKNOW = new Scene("UNKNOW", 0, 0);
        public static final Scene IAB = new Scene("IAB", 1, 1);
        public static final Scene MIDDLE_PAGE = new Scene("MIDDLE_PAGE", 2, 2);

        public static final /* synthetic */ Scene[] $values() {
            return new Scene[]{UNKNOW, IAB, MIDDLE_PAGE};
        }

        public static InterfaceC2044707zh<Scene> getEntries() {
            return $ENTRIES;
        }

        static {
            Scene[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = new C2254308sP(sceneArr$values);
        }

        public static Scene[] values() {
            return (Scene[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static Scene valueOf(String str) {
            return (Scene) C08FF.LIZ(Scene.class, str);
        }

        public Scene(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public static final class SerializationProxy implements Serializable {
        public static final Companion Companion = new Companion();
        public static final long serialVersionUID = 1;
        public final Map<String, AdExternalGuideDialogConfig> dialogConfig;
        public final String params;
        public final Integer scene;
        public final Integer type;

        public static final class Companion {
        }

        public SerializationProxy() {
            this(null, null, null, null);
        }

        private final Object readResolve() {
            Object c098200Yq;
            Integer num = this.type;
            Integer num2 = this.scene;
            try {
                c098200Yq = (k) C09C2.LIZ().LJII(this.params, k.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return new AdExternalGuideTriggerCondition(num, num2, (k) c098200Yq, this.dialogConfig);
        }

        public final Map<String, AdExternalGuideDialogConfig> getDialogConfig() {
            return this.dialogConfig;
        }

        public final String getParams() {
            return this.params;
        }

        public final Integer getScene() {
            return this.scene;
        }

        public final Integer getType() {
            return this.type;
        }

        public SerializationProxy(Integer num, Integer num2, String str, Map<String, AdExternalGuideDialogConfig> map) {
            this.type = num;
            this.scene = num2;
            this.params = str;
            this.dialogConfig = map;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public final int value;
        public static final Type UNKNOW = new Type("UNKNOW", 0, 0);
        public static final Type DELAY = new Type("DELAY", 1, 1);
        public static final Type LOGIN = new Type("LOGIN", 2, 2);
        public static final Type FRONT_END = new Type("FRONT_END", 3, 3);

        public static final /* synthetic */ Type[] $values() {
            return new Type[]{UNKNOW, DELAY, LOGIN, FRONT_END};
        }

        public static InterfaceC2044707zh<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = new C2254308sP(typeArr$values);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }

        public Type(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public AdExternalGuideTriggerCondition() {
        this(null, null, null, null);
    }

    private final Object writeReplace() {
        Integer num = this.type;
        Integer num2 = this.scene;
        k kVar = this.params;
        return new SerializationProxy(num, num2, kVar != null ? kVar.toString() : null, this.dialogConfig);
    }

    public final Map<String, AdExternalGuideDialogConfig> getDialogConfig() {
        return this.dialogConfig;
    }

    public final k getParams() {
        return this.params;
    }

    public final Integer getScene() {
        return this.scene;
    }

    public final Integer getType() {
        return this.type;
    }

    public AdExternalGuideTriggerCondition(Integer num) {
        this(num, null, null, null);
    }

    public AdExternalGuideTriggerCondition(Integer num, Integer num2) {
        this(num, num2, null, null);
    }

    public AdExternalGuideTriggerCondition(Integer num, Integer num2, k kVar) {
        this(num, num2, kVar, null);
    }

    public AdExternalGuideTriggerCondition(Integer num, Integer num2, k kVar, Map<String, AdExternalGuideDialogConfig> map) {
        this.type = num;
        this.scene = num2;
        this.params = kVar;
        this.dialogConfig = map;
    }
}
