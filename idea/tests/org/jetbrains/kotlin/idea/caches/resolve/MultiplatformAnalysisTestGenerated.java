/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiplatformAnalysisTestGenerated extends AbstractMultiplatformAnalysisTest {
    @TestMetadata("idea/testData/multiplatform")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Multiplatform extends AbstractMultiplatformAnalysisTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMultiplatform() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/multiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("internalFromDependsOn")
        public void testInternalFromDependsOn() throws Exception {
            runTest("idea/testData/multiplatform/internalFromDependsOn/");
        }

        @TestMetadata("internalFromDependsOnOfProduction")
        public void testInternalFromDependsOnOfProduction() throws Exception {
            runTest("idea/testData/multiplatform/internalFromDependsOnOfProduction/");
        }

        @TestMetadata("internalFromProduction")
        public void testInternalFromProduction() throws Exception {
            runTest("idea/testData/multiplatform/internalFromProduction/");
        }
    }

    @TestMetadata("idea/testData/multiplatformTypeRefinement")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiplatformTypeRefinement extends AbstractMultiplatformAnalysisTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        @TestMetadata("aliasesTypeMismatch")
        public void testAliasesTypeMismatch() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/aliasesTypeMismatch/");
        }

        public void testAllFilesPresentInMultiplatformTypeRefinement() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/multiplatformTypeRefinement"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("diamondModuleDependency1")
        public void testDiamondModuleDependency1() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/diamondModuleDependency1/");
        }

        @TestMetadata("diamondModuleDependency2")
        public void testDiamondModuleDependency2() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/diamondModuleDependency2/");
        }

        @TestMetadata("lambdas")
        public void testLambdas() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/lambdas/");
        }

        @TestMetadata("jsNameClash")
        public void testJsNameClash() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/jsNameClash/");
        }

        @TestMetadata("languageConstructions")
        public void testLanguageConstructions() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/languageConstructions/");
        }

        @TestMetadata("multilevelParents")
        public void testMultilevelParents() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/multilevelParents/");
        }

        @TestMetadata("simple")
        public void testSimple() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/simple/");
        }

        @TestMetadata("supertypes")
        public void testSupertypes() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/supertypes/");
        }

        @TestMetadata("typeAliases")
        public void testTypeAliases() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/typeAliases/");
        }

        @TestMetadata("typeParameters")
        public void testTypeParameters() throws Exception {
            runTest("idea/testData/multiplatformTypeRefinement/typeParameters/");
        }
    }
}
